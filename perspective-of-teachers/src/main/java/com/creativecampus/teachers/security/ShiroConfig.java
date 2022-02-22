package com.creativecampus.teachers.security;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Configurations for Shiro.
 *
 * ShiroFilter
 * SecurityManager
 * Realm
 */
@Configuration
public class ShiroConfig
{
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager defaultWebSecurityManager)
    {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);

        // Configure restricted resources and public resources.
        Map<String, String> authorizationMap = new HashMap<>();
        // anon has higher priority than authc.
        authorizationMap.put("/index.jsp", "authc"); // Marked as restricted (most resources are restricted).
        authorizationMap.put("/xxx", "anon"); // Url like login are not restricted.
        shiroFilterFactoryBean.setFilterChainDefinitionMap(authorizationMap);

        // Default login url.
        shiroFilterFactoryBean.setLoginUrl("/login.jsp");

        return shiroFilterFactoryBean;
    }

    // Note: The Qualifier annotation.
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("getRealm") Realm realm)
    {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(realm);

        return defaultWebSecurityManager;
    }

    @Bean
    public Realm getRealm()
    {
        return new FrontLineRealm();
    }

    @Bean
    public Subject subject()
    {
        return SecurityUtils.getSubject();
    }
}
