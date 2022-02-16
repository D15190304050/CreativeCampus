package com.creativecampus.commons.domain;

public class Major
{
    private long id;

    private String name;

    private long disciplineId;

    private String description;

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

    public long getDisciplineId()
    {
        return disciplineId;
    }

    public void setDisciplineId(long disciplineId)
    {
        this.disciplineId = disciplineId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description == null ? null : description.trim();
    }
}