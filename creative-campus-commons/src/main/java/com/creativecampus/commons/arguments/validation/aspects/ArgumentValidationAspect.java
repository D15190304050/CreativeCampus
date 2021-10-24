package com.creativecampus.commons.arguments.validation.aspects;

import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.arguments.ArgumentBase;
import com.creativecampus.commons.arguments.validation.ArgumentValidation;
import com.creativecampus.commons.arguments.validation.ArgumentValidationBase;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Aspect
@Component
@Slf4j
public class ArgumentValidationAspect
{
    @Pointcut("@annotation(com.creativecampus.commons.arguments.validation.ArgumentValidation))")
    private void argumentValidationJoinPoint(){}

    @Pointcut("execution(public com.creativecampus.commons.ServiceResponse com.creativecampus..*.*(..))")
    private void returnTypeJoinPoint(){}

    @Around("argumentValidationJoinPoint() && returnTypeJoinPoint()")
    public Object validateArgument(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        Object[] arguments = proceedingJoinPoint.getArgs();
        Class<?>[] parameterTypes = ArgumentBase.getParameterTypes(proceedingJoinPoint);

        for (int i = 0; i < arguments.length; i++)
        {
            Class<?> parameterType = parameterTypes[i];
            if (parameterType.getAnnotation(ArgumentValidation.class) != null)
            {
                Object argument = arguments[i];
                String validationErrorMessage = ArgumentValidationBase.getValidationErrorMessage(argument);

                // Interrupt the execution of the called method and return argument exception.
                if (StringUtils.hasText(validationErrorMessage))
                {
                    log.error("Argument = " + JsonSerializer.serialize(argument));
                    log.error("Validation error message = " + validationErrorMessage);
                    return ServiceResponse.buildErrorResponse(CommonErrorResponses.ARGUMENT_EXCEPTION.getCode(), validationErrorMessage);
                }
            }
        }

        return proceedingJoinPoint.proceed();
    }
}
