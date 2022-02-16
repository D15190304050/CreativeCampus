package com.creativecampus.commons.constants;

public enum QuestionSource
{
    ORIGINAL(0),
    REPRINT(1);

    private final int code;

    QuestionSource(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }
}
