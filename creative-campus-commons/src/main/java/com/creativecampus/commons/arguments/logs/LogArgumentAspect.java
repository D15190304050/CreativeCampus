package com.creativecampus.commons.arguments.logs;

import com.creativecampus.commons.arguments.ArgumentBase;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * The {@link LogArgumentAspect} aspect logs arguments of public methods of classes with the {@link LogArguments} annotation.
 */
@Aspect
@Component
@Slf4j
public class LogArgumentAspect
{
    @Pointcut("execution(public com.creativecampus.commons.ServiceResponse com.creativecampus..*.*(..))")
    private void returnTypeJoinPoint(){}

    @Pointcut("@within(com.creativecampus.commons.arguments.logs.LogArguments)")
    private void logArgumentJoinPoint(){}

    @Pointcut("@within(com.creativecampus.commons.arguments.LogAndValidate)")
    private void logAndValidateJoinPoint(){}

    @Pointcut("logArgumentJoinPoint() || logAndValidateJoinPoint()")
    private void acceptableAnnotations(){}

    @Before("returnTypeJoinPoint() && acceptableAnnotations()")
    public void logArguments(JoinPoint joinPoint)
    {
        Object[] arguments = joinPoint.getArgs();

        if (arguments.length > 0)
        {
            Class<?>[] parameterTypes = ArgumentBase.getParameterTypes(joinPoint);

            Signature signature = joinPoint.getSignature();
            log.info("Log arguments of " + signature.getDeclaringTypeName() + "#" + signature.getName());
            for (int i = 0; i < arguments.length; i++)
                log.info("Argument [" + i + "] (" + parameterTypes[i].getName() + ") = " + JsonSerializer.serialize(arguments[i]));
        }
    }
}
