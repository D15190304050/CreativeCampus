package com.creativecampus.commons.constants;

public enum MarkingType
{
    AUTO(0),
    MANUAL(1),
    ;

    private final int code;

    MarkingType(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }
}
