package com.creativecampus.commons.domain;

import java.util.Date;

public class KnowledgePointPrerequisite
{
    private long id;

    private long knowledgePointId;

    private long prerequisiteKnowledgePointId;

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

    public long getKnowledgePointId()
    {
        return knowledgePointId;
    }

    public void setKnowledgePointId(long knowledgePointId)
    {
        this.knowledgePointId = knowledgePointId;
    }

    public long getPrerequisiteKnowledgePointId()
    {
        return prerequisiteKnowledgePointId;
    }

    public void setPrerequisiteKnowledgePointId(long prerequisiteKnowledgePointId)
    {
        this.prerequisiteKnowledgePointId = prerequisiteKnowledgePointId;
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