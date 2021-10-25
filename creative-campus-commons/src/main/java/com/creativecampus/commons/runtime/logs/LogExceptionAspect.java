package com.creativecampus.commons.runtime.logs;

import com.creativecampus.commons.runtime.ArgumentBase;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * The {@link LogExceptionAspect} aspect logs arguments of public methods of classes with the {@link LogArguments} annotation.
 */
@Aspect
@Component
@Slf4j
public class LogExceptionAspect
{
    @Pointcut("execution(public com.creativecampus.commons.ServiceResponse com.creativecampus..*.*(..))")
    private void returnTypeJoinPoint(){}

    @Pointcut("@within(com.creativecampus.commons.runtime.logs.LogException)")
    private void logExceptionsJoinPoint(){}

    @Pointcut("@within(com.creativecampus.commons.runtime.LogAndValidate)")
    private void logAndValidateJoinPoint(){}

    @Pointcut("logExceptionsJoinPoint() || logAndValidateJoinPoint()")
    private void acceptableAnnotations(){}

    @AfterThrowing(pointcut = "returnTypeJoinPoint() && acceptableAnnotations()", throwing = "error")
    public void logExceptions(JoinPoint joinPoint, Throwable error)
    {
        String errorStackTrace = Arrays.toString(error.getStackTrace());
        errorStackTrace = errorStackTrace.substring(1, errorStackTrace.length() - 1);
        errorStackTrace = errorStackTrace.replace(", ", System.lineSeparator());
        log.error("Error when executing " + ArgumentBase.getMethodPath(joinPoint) + " = " + error.getMessage() + System.lineSeparator() + "Stack trace:" + System.lineSeparator() + errorStackTrace);
    }
}
