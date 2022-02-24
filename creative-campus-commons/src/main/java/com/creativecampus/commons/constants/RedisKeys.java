package com.creativecampus.commons.constants;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

@Slf4j
public class RedisKeys
{
    private RedisKeys()
    {
    }

    private final static String SESSION_ID = "SESSION_ID_";
    private final static String SESSION_ID_NULL_EXCEPTION_MESSAGE = "Error: session id can not be null or empty here.";

    public static String getSessionIdKey(String sessionId)
    {
        if (!StringUtils.hasText(sessionId))
        {
            log.error(SESSION_ID_NULL_EXCEPTION_MESSAGE);
            throw new NullPointerException(SESSION_ID_NULL_EXCEPTION_MESSAGE);
        }

        String sessionIdKey = SESSION_ID + sessionId;
        log.info("sessionIdKey = " + sessionIdKey);
        return sessionIdKey;
    }
}
