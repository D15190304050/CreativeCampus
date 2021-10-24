package com.creativecampus.commons.arguments.validation.inteceptors;

import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.arguments.validation.ArgumentValidation;
import com.creativecampus.commons.arguments.validation.ArgumentValidationBase;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dataworks.Encoding;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Parameter;
import java.nio.charset.StandardCharsets;

@Slf4j
@Component
public class ControllerArgumentValidationHandler implements HandlerInterceptor
{
    private static final String POST = "POST";
    private static final String GET = "GET";
    private static final String QUERY_VARIABLE_SEPARATOR = "&";
    private static final String QUERY_VARIABLE_KEY_VALUE_SEPARATOR = "=";
    private static final int QUERY_VARIABLE_KEY_VALUE_LENGTH = 2;
    private static final int QUERY_VARIABLE_KEY_INDEX = 0;
    private static final int QUERY_VARIABLE_VALUE_INDEX = 1;

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        MethodParameter methodParameter = getMethodParameterToValidate((HandlerMethod) handler);
        if (methodParameter != null)
        {
            // Get the type of the parameter to validate.
            Parameter parameter = methodParameter.getParameter();
            Class<?> type = parameter.getType();

            Object argument = parseRequestArgument(request, type);

            // Validate iff the ArgumentValidation annotation is present.
            if (type.getAnnotation(ArgumentValidation.class) != null)
            {
                String validationErrorMessage = ArgumentValidationBase.getValidationErrorMessage(argument);
                if (StringUtils.hasText(validationErrorMessage))
                {
                    writeErrorResponse(response, validationErrorMessage);
                    return false;
                }
            }
        }

        return true;
    }

    private static MethodParameter getMethodParameterToValidate(HandlerMethod handlerMethod)
    {
        MethodParameter[] methodParameters = handlerMethod.getMethodParameters();
        for (MethodParameter methodParameter : methodParameters)
        {
            if (methodParameter.getParameterAnnotation(RequestBody.class) != null)
                return methodParameter;
        }
        return null;
    }

    private static ObjectNode queryString2ObjectNode(HttpServletRequest request)
    {
        ObjectNode objectNode = MAPPER.createObjectNode();

        String queryString = request.getQueryString();
        if (StringUtils.hasText(queryString))
        {
            String[] queryVariables = queryString.split(QUERY_VARIABLE_SEPARATOR);
            for (String queryVariable : queryVariables)
            {
                if (StringUtils.hasText(queryVariable))
                {
                    String[] queryVariableKeyValue = queryVariable.split(QUERY_VARIABLE_KEY_VALUE_SEPARATOR);
                    if (queryVariableKeyValue.length == QUERY_VARIABLE_KEY_VALUE_LENGTH)
                        objectNode.put(queryVariableKeyValue[QUERY_VARIABLE_KEY_INDEX], queryVariableKeyValue[QUERY_VARIABLE_VALUE_INDEX]);
                }
            }
        }

        return objectNode;
    }

    private static <T> T parseQueryString(HttpServletRequest request, Class<T> clazz)
    {
        ObjectNode objectNode = queryString2ObjectNode(request);
        return JsonSerializer.deserialize(objectNode.toString(), clazz);
    }

    private static <T> T parseQueryBody(HttpServletRequest request, Class<T> clazz) throws IOException
    {
        byte[] bodyBytes = StreamUtils.copyToByteArray(request.getInputStream());
        String queryBody = new String(bodyBytes, request.getCharacterEncoding());
        return JsonSerializer.deserialize(queryBody, clazz);
    }

    private static <T> T parseRequestArgument(HttpServletRequest request, Class<T> clazz) throws IOException
    {
        String httpMethod = request.getMethod().trim().toUpperCase();
        log.info("The current http method is: " + httpMethod);
        switch (httpMethod)
        {
            case GET:
                return parseQueryString(request, clazz);
            case POST:
                return parseQueryBody(request, clazz);
            default:
                log.error("HTTP method " + httpMethod + " is not supported for argument validation.");
                return null;
        }
    }

    private static void writeErrorResponse(HttpServletResponse response, String errorMessage)
    {
        ServiceResponse<Object> errorResponse = ServiceResponse.buildErrorResponse(CommonErrorResponses.ARGUMENT_EXCEPTION.getCode(), errorMessage);

        response.setCharacterEncoding(Encoding.UTF_8);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);

        OutputStream out = null;
        try
        {
            out = response.getOutputStream();
            out.write(errorResponse.toString().getBytes(StandardCharsets.UTF_8));
        }
        catch (IllegalStateException | IOException e)
        {
            log.error("Error: ", e);
        }
        finally
        {
            try
            {
                if (out != null)
                    out.close();
            }
            catch (IOException e)
            {
                log.error("Error: ", e);
            }
        }
    }
}
