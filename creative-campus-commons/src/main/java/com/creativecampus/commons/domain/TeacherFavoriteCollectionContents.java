package com.creativecampus.commons.domain;

import java.util.Date;

public class TeacherFavoriteCollectionContents
{
    private Long id;

    private Long collectionId;

    private Long contentId;

    private Date creationTime;

    private Date updateTime;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getCollectionId()
    {
        return collectionId;
    }

    public void setCollectionId(Long collectionId)
    {
        this.collectionId = collectionId;
    }

    public Long getContentId()
    {
        return contentId;
    }

    public void setContentId(Long contentId)
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