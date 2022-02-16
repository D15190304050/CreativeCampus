package com.creativecampus.commons.domain;

public enum Visibility
{
    PUBLIC(0),
    PROTECTED(1),
    PRIVATE(2),
    ;

    private final int code;

    Visibility(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }
}
