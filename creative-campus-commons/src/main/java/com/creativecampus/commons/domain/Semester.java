package com.creativecampus.commons.domain;

public class Semester
{
    private long id;

    private String name;

    private int approximateStartMonth;

    private int approximateStartDay;

    private int approximateEndMonth;

    private int approximateEndDay;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name == null ? null : name.trim();
    }

    public int getApproximateStartMonth()
    {
        return approximateStartMonth;
    }

    public void setApproximateStartMonth(int approximateStartMonth)
    {
        this.approximateStartMonth = approximateStartMonth;
    }

    public int getApproximateStartDay()
    {
        return approximateStartDay;
    }

    public void setApproximateStartDay(int approximateStartDay)
    {
        this.approximateStartDay = approximateStartDay;
    }

    public int getApproximateEndMonth()
    {
        return approximateEndMonth;
    }

    public void setApproximateEndMonth(int approximateEndMonth)
    {
        this.approximateEndMonth = approximateEndMonth;
    }

    public int getApproximateEndDay()
    {
        return approximateEndDay;
    }

    public void setApproximateEndDay(int approximateEndDay)
    {
        this.approximateEndDay = approximateEndDay;
    }
}