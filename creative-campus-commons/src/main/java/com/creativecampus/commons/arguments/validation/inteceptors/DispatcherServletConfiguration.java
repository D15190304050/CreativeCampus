package com.creativecampus.commons.arguments.validation.inteceptors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DispatcherServletConfiguration implements WebMvcConfigurer
{
    // Add all needed interceptors here.
    // Call addPathPatterns() method to add patterns of request mappings to intercept.
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        // Uncomment the following line to open argument validation for all requested methods.
        registry.addInterceptor(new ControllerArgumentValidationHandler()).addPathPatterns("/**");
    }

    @Bean
    @Qualifier(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
    public DispatcherServlet dispatcherServlet()
    {
        return new RepeatableDispatcherServlet();
    }
}
