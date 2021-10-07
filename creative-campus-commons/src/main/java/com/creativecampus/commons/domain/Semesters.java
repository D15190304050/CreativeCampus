package com.creativecampus.commons.domain;

public class Semesters
{
    private Long id;

    private String name;

    private Integer approximateStartMonth;

    private Integer approximateStartDay;

    private Integer approximateEndMonth;

    private Integer approximateEndDay;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
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

    public Integer getApproximateStartMonth()
    {
        return approximateStartMonth;
    }

    public void setApproximateStartMonth(Integer approximateStartMonth)
    {
        this.approximateStartMonth = approximateStartMonth;
    }

    public Integer getApproximateStartDay()
    {
        return approximateStartDay;
    }

    public void setApproximateStartDay(Integer approximateStartDay)
    {
        this.approximateStartDay = approximateStartDay;
    }

    public Integer getApproximateEndMonth()
    {
        return approximateEndMonth;
    }

    public void setApproximateEndMonth(Integer approximateEndMonth)
    {
        this.approximateEndMonth = approximateEndMonth;
    }

    public Integer getApproximateEndDay()
    {
        return approximateEndDay;
    }

    public void setApproximateEndDay(Integer approximateEndDay)
    {
        this.approximateEndDay = approximateEndDay;
    }
}