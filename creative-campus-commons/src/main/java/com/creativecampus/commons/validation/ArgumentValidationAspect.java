package com.creativecampus.commons.validation;

import com.creativecampus.commons.CommonFailureResponses;
import com.creativecampus.commons.ControllerResponse;
import dataworks.Encoding;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Aspect
@Component
@Slf4j
public class ArgumentValidationAspect
{
    @Pointcut("@annotation(ArgumentValidation)")
    private void argumentValidationJointPoint(){}

    @Before("argumentValidationJointPoint()")
    public void validateArgument(JoinPoint joinPoint)
    {
        Object[] arguments = joinPoint.getArgs();
        StringBuilder errorMessageBuilder = new StringBuilder();

        if (arguments.length > 0)
        {
            for (Object object : arguments)
            {
                if (object instanceof BindingResult)
                {
                    BindingResult bindingResult = (BindingResult) object;
                    if (bindingResult.hasErrors())
                    {
                        List<ObjectError> allErrors = bindingResult.getAllErrors();
                        for (ObjectError objectError : allErrors)
                            errorMessageBuilder.append(objectError.getDefaultMessage());
                    }
                }
            }
        }

        String validationResult = errorMessageBuilder.toString();
        if (!StringUtils.hasText(validationResult))
        {

        }
    }
}
