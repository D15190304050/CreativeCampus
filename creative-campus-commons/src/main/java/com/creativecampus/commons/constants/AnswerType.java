package com.creativecampus.commons.constants;

public enum AnswerType
{
    SIMPLE_TEXT(0),
    RICH_TEXT(1),
    ;

    private final int code;

    AnswerType(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }
}
