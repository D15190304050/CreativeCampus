package com.creativecampus.commons.domain;

import java.util.Date;

public class HomeworkComments {
    private Long id;

    private Long homeworkId;

    private Long preHomeworkCommentId;

    private Long accountId;

    private Date publishTime;

    private Byte isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Long homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Long getPreHomeworkCommentId() {
        return preHomeworkCommentId;
    }

    public void setPreHomeworkCommentId(Long preHomeworkCommentId) {
        this.preHomeworkCommentId = preHomeworkCommentId;
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

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}