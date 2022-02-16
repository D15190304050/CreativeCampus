package com.creativecampus.commons.domain;

import java.util.Date;

public class TeacherQuestionLike
{
    private long id;

    private long teacherId;

    private long questionId;

    private Date creationTime;

    private Byte likes;

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

    public long getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(long questionId)
    {
        this.questionId = questionId;
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(Date creationTime)
    {
        this.creationTime = creationTime;
    }

    public Byte getLikes()
    {
        return likes;
    }

    public void setLikes(Byte likes)
    {
        this.likes = likes;
    }
}