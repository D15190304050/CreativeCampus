package com.creativecampus.commons.domain;

import java.util.Date;

public class TeacherQuestionLikes
{
    private Long id;

    private Long teacherId;

    private Long questionId;

    private Date creationTime;

    private Byte likes;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Long teacherId)
    {
        this.teacherId = teacherId;
    }

    public Long getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(Long questionId)
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