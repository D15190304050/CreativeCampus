package com.creativecampus.commons.domain;

import java.util.Date;

public class TeacherFavoriteCollectionContent
{
    private long id;

    private long collectionId;

    private long contentId;

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

    public long getCollectionId()
    {
        return collectionId;
    }

    public void setCollectionId(long collectionId)
    {
        this.collectionId = collectionId;
    }

    public long getContentId()
    {
        return contentId;
    }

    public void setContentId(long contentId)
    {
        this.contentId = contentId;
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