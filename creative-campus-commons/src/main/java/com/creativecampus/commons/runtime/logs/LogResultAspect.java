package com.creativecampus.commons.runtime.logs;

import com.creativecampus.commons.runtime.ArgumentBase;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * The {@link LogResultAspect} aspect logs arguments of public methods of classes with the {@link LogArguments} annotation.
 */
@Aspect
@Component
@Slf4j
public class LogResultAspect
{
    @Pointcut("execution(public com.creativecampus.commons.ServiceResponse com.creativecampus..*.*(..))")
    private void returnTypeJoinPoint(){}

    @Pointcut("@within(com.creativecampus.commons.runtime.logs.LogResult)")
    private void logResultJoinPoint(){}

    @Pointcut("@within(com.creativecampus.commons.runtime.LogAndValidate)")
    private void logAndValidateJoinPoint(){}

    @Pointcut("logResultJoinPoint() || logAndValidateJoinPoint()")
    private void acceptableAnnotations(){}

    @AfterReturning(pointcut = "returnTypeJoinPoint() && acceptableAnnotations()", returning = "result")
    public void logResult(JoinPoint joinPoint, Object result)
    {
        log.info("Result of " + ArgumentBase.getMethodPath(joinPoint) + " = " + JsonSerializer.serialize(result));
    }
}
