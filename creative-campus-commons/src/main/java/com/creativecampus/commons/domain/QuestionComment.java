package com.creativecampus.commons.domain;

import java.util.Date;

public class QuestionComment
{
    private long id;

    private long questionId;

    private long preQuestionCommentId;

    private long questionCommentContentId;

    private long accountId;

    private Date publishTime;

    private Boolean isDeleted;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(long questionId)
    {
        this.questionId = questionId;
    }

    public long getPreQuestionCommentId()
    {
        return preQuestionCommentId;
    }

    public void setPreQuestionCommentId(long preQuestionCommentId)
    {
        this.preQuestionCommentId = preQuestionCommentId;
    }

    public long getQuestionCommentContentId()
    {
        return questionCommentContentId;
    }

    public void setQuestionCommentContentId(long questionCommentContentId)
    {
        this.questionCommentContentId = questionCommentContentId;
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

    public Boolean getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted)
    {
        this.isDeleted = isDeleted;
    }
}