package com.creativecampus.commons.arguments.logs;

import com.creativecampus.commons.arguments.ArgumentBase;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
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

    @Before("returnTypeJoinPoint() && logArgumentJoinPoint()")
    public void logArguments(JoinPoint joinPoint)
    {
        Object[] arguments = joinPoint.getArgs();

        if (arguments.length > 0)
        {
            Class<?>[] parameterTypes = ArgumentBase.getParameterTypes(joinPoint);

            log.info("Log arguments of " + joinPoint.getSignature().getName());
            for (int i = 0; i < arguments.length; i++)
                log.info("Argument [" + i + "] (" + parameterTypes[i].getName() + ") = " + JsonSerializer.serialize(arguments[i]));
        }
    }
}
