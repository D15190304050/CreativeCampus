package com.creativecampus.commons.runtime.interceptors;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RepeatableDispatcherServlet extends DispatcherServlet
{
    @Override
    protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        super.doDispatch(new RepeatableHttpServletRequestWrapper(request), response);
    }
}
