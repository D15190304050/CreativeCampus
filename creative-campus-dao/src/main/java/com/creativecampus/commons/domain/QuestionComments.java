package com.creativecampus.commons.domain;

import java.util.Date;

public class QuestionComments {
    private Long id;

    private Long questionId;

    private Long preQuestionCommentId;

    private Long questionCommentContentId;

    private Long accountId;

    private Date publishTime;

    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getPreQuestionCommentId() {
        return preQuestionCommentId;
    }

    public void setPreQuestionCommentId(Long preQuestionCommentId) {
        this.preQuestionCommentId = preQuestionCommentId;
    }

    public Long getQuestionCommentContentId() {
        return questionCommentContentId;
    }

    public void setQuestionCommentContentId(Long questionCommentContentId) {
        this.questionCommentContentId = questionCommentContentId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}