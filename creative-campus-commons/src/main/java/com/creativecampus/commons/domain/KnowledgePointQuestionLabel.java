package com.creativecampus.commons.domain;

import java.util.Date;

public class KnowledgePointQuestionLabel
{
    private long id;

    private String name;

    private long recentFrequencyId;

    private long creatorId;

    private Date creationTime;

    private long updateOperatorId;

    private Date updateTime;

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

    public long getRecentFrequencyId()
    {
        return recentFrequencyId;
    }

    public void setRecentFrequencyId(long recentFrequencyId)
    {
        this.recentFrequencyId = recentFrequencyId;
    }

    public long getCreatorId()
    {
        return creatorId;
    }

    public void setCreatorId(long creatorId)
    {
        this.creatorId = creatorId;
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(Date creationTime)
    {
        this.creationTime = creationTime;
    }

    public long getUpdateOperatorId()
    {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(long updateOperatorId)
    {
        this.updateOperatorId = updateOperatorId;
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