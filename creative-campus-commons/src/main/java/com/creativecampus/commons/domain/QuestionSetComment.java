package com.creativecampus.commons.domain;

import java.util.Date;

public class QuestionSetComment
{
    private long id;

    private long homeworkId;

    private long preHomeworkCommentId;

    private long accountId;

    private Date publishTime;

    private Byte isDeleted;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getHomeworkId()
    {
        return homeworkId;
    }

    public void setHomeworkId(long homeworkId)
    {
        this.homeworkId = homeworkId;
    }

    public long getPreHomeworkCommentId()
    {
        return preHomeworkCommentId;
    }

    public void setPreHomeworkCommentId(long preHomeworkCommentId)
    {
        this.preHomeworkCommentId = preHomeworkCommentId;
    }

    public long getAccountId()
    {
        return accountId;
    }

    public void setAccountId(long accountId)
    {
        this.accountId = accountId;
    }

    public Date getPublishTime()
    {
        return publishTime;
    }

    public void setPublishTime(Date publishTime)
    {
        this.publishTime = publishTime;
    }

    public Byte getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted)
    {
        this.isDeleted = isDeleted;
    }
}