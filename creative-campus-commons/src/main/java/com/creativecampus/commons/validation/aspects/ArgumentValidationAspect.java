package com.creativecampus.commons.validation.aspects;

import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.validation.ArgumentValidation;
import com.creativecampus.commons.validation.ArgumentValidationBase;
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
    public ArgumentValidationAspect()
    {
        log.info("Instantiated...");
    }

    @Pointcut("@annotation(com.creativecampus.commons.validation.ArgumentValidation))")
    private void argumentValidationJoinPoint(){}

    @Pointcut("execution(public com.creativecampus.commons.ServiceResponse com.creativecampus..*.*(..))")
    private void returnTypeJoinPoint(){}

    @Around("argumentValidationJoinPoint() && returnTypeJoinPoint()")
//    @Before("argumentValidationJoinPoint()")
    public Object validateArgument(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        Object[] arguments = proceedingJoinPoint.getArgs();
        Signature signature = proceedingJoinPoint.getSignature();

        MethodSignature methodSignature = (MethodSignature) signature;
        Class<?>[] parameterTypes = methodSignature.getParameterTypes();

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
                    log.error("argument = " + JsonSerializer.serialize(argument));
                    log.error("validation error message = " + validationErrorMessage);
                    return ServiceResponse.buildErrorResponse(CommonErrorResponses.ARGUMENT_EXCEPTION.getCode(), validationErrorMessage);
                }
            }
        }

        return proceedingJoinPoint.proceed();
    }
}
