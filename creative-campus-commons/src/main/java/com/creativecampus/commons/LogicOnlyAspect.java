package com.creativecampus.commons;

import com.creativecampus.commons.runtime.ArgumentBase;
import com.creativecampus.commons.runtime.validation.ArgumentValidator;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;

@Aspect
@Slf4j
@Component
public class LogicOnlyAspect
{
    @Pointcut("@within(com.creativecampus.commons.LogicOnly))")
    private void argumentValidationJoinPoint()
    {
    }

    @Pointcut("execution(public com.creativecampus.commons.ServiceResponse com.creativecampus..*.*(..))")
    private void returnTypeJoinPoint()
    {
    }

    @Pointcut("argumentValidationJoinPoint() && returnTypeJoinPoint()")
    private void loginOnlyJoinPoint()
    {
    }

    @Around("loginOnlyJoinPoint()")
    public Object handleArgumentsAndAfter(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        logArguments(proceedingJoinPoint);

        ServiceResponse<?> validationResult = validateArguments(proceedingJoinPoint);
        if (validationResult != null)
            return validationResult;

        return handleAfter(proceedingJoinPoint);
    }

    private ServiceResponse<?> validateArguments(ProceedingJoinPoint proceedingJoinPoint)
    {
        Object[] arguments = proceedingJoinPoint.getArgs();

        for (int i = 0; i < arguments.length; i++)
        {
            Object argument = arguments[i];
            String validationErrorMessage = ArgumentValidator.getValidationErrorMessage(argument);

            // Interrupt the execution of the called method and return argument exception.
            if (StringUtils.hasText(validationErrorMessage))
            {
                log.error("Argument constraint violation found for: " + ArgumentBase.getMethodPath(proceedingJoinPoint));
                log.error("Argument [" + i + "]" + " = " + JsonSerializer.serialize(argument));
                log.error("Validation error message = " + validationErrorMessage);
                return ServiceResponse.buildErrorResponse(CommonErrorResponses.ARGUMENT_EXCEPTION.getCode(), validationErrorMessage);
            }
        }

        return null;
    }

    private void logArguments(JoinPoint joinPoint)
    {
        Object[] arguments = joinPoint.getArgs();

        if (arguments.length > 0)
        {
            Class<?>[] parameterTypes = ArgumentBase.getParameterTypes(joinPoint);

            log.info("Log arguments of " + ArgumentBase.getMethodPath(joinPoint));
            for (int i = 0; i < arguments.length; i++)
                log.info("Argument [" + i + "] (" + parameterTypes[i].getName() + ") = " + JsonSerializer.serialize(arguments[i]));
        }
    }

    private Object handleAfter(ProceedingJoinPoint proceedingJoinPoint)
    {
        // Execute the method and catch the exception.
        try
        {
            Object result = proceedingJoinPoint.proceed();
            log.info("Result of " + ArgumentBase.getMethodPath(proceedingJoinPoint) + " = " + JsonSerializer.serialize(result));
            return result;
        }
        catch (Throwable error)
        {
            String errorStackTrace = Arrays.toString(error.getStackTrace());
            errorStackTrace = errorStackTrace.substring(1, errorStackTrace.length() - 1);
            errorStackTrace = errorStackTrace.replace(", ", System.lineSeparator());
            log.error("Error when executing " + ArgumentBase.getMethodPath(proceedingJoinPoint) + " = " + error.getMessage() + System.lineSeparator() + "Stack trace:" + System.lineSeparator() + errorStackTrace);
            return ServiceResponse.buildErrorResponse(CommonErrorResponses.SYSTEM_ERROR.getCode(), errorStackTrace);
        }
    }
}
