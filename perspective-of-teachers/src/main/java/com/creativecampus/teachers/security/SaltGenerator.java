package com.creativecampus.teachers.security;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;

public class SaltGenerator
{
    private static final SecureRandomNumberGenerator secureRandomNumberGenerator;

    private SaltGenerator()
    {
    }

    static
    {
        secureRandomNumberGenerator = new SecureRandomNumberGenerator();
    }

    public static String nextSalt()
    {
        return secureRandomNumberGenerator.nextBytes().toHex();
    }
}
