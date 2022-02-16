package com.creativecampus.commons.domain;

import java.util.Date;

public class TeacherFavoriteCollection
{
    private long id;

    private long teacherId;

    private long favoriteTypeId;

    private String name;

    private Date creationTime;

    private Date updateTime;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(long teacherId)
    {
        this.teacherId = teacherId;
    }

    public long getFavoriteTypeId()
    {
        return favoriteTypeId;
    }

    public void setFavoriteTypeId(long favoriteTypeId)
    {
        this.favoriteTypeId = favoriteTypeId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(Date creationTime)
    {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
}