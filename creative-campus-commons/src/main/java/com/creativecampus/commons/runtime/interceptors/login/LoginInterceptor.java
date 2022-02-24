package com.creativecampus.commons.runtime.interceptors.login;

import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.runtime.interceptors.InterceptorBase;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.constants.RedisPrefixes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor
{
    @Autowired
    private ValueOperations<String, Object> valueOperations;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    {
        HttpSession session = request.getSession();
        String sessionId = session.getId();
        String sessionIdKey = RedisPrefixes.SESSION_ID + sessionId;

        Object sessionUserId = valueOperations.get(sessionIdKey);
        if (sessionUserId != null)
            return true;
        else
        {
            ServiceResponse<Object> serviceResponse = ServiceResponse.buildErrorResponse(CommonErrorResponses.NOT_LOGIN);
            InterceptorBase.writeErrorResponse(response, serviceResponse);
            return false;
        }
    }
}
