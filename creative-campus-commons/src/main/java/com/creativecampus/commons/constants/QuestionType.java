package com.creativecampus.commons.constants;

public enum QuestionType
{
    FILL_IN_THE_BLANK(0),
    MULTIPLE_CHOICE(1),
    TRUE_OR_FALSE(2),
    ANALYSIS(3),
    ;

    private final int code;

    QuestionType(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }
}
