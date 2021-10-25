package com.creativecampus.commons.runtime.validation;

import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.runtime.ArgumentBase;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Aspect
@Component
@Slf4j
public class ArgumentValidationAspect
{
    //    @Pointcut("@annotation(com.creativecampus.commons.arguments.validation.ArgumentValidation))")
    @Pointcut("@within(com.creativecampus.commons.runtime.validation.ArgumentValidation))")
    private void argumentValidationJoinPoint()
    {
    }

    @Pointcut("execution(public com.creativecampus.commons.ServiceResponse com.creativecampus..*.*(..))")
    private void returnTypeJoinPoint()
    {
    }

    @Pointcut("@within(com.creativecampus.commons.runtime.LogAndValidate)")
    private void logAndValidateJoinPoint(){}

    @Pointcut("argumentValidationJoinPoint() || logAndValidateJoinPoint()")
    private void acceptableAnnotations(){}

    @Around("acceptableAnnotations() && returnTypeJoinPoint()")
    public Object validateArgument(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
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
//                return ServiceResponse.buildErrorResponse(CommonErrorResponses.ARGUMENT_EXCEPTION.getCode(), validationErrorMessage);
            }
        }

        return proceedingJoinPoint.proceed();
    }
}
