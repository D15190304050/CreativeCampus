package com.creativecampus.commons.domain;

import java.util.Date;

public class KnowledgePointQuestionLabels {
    private Long id;

    private String name;

    private Long recentFrequencyId;

    private Long creatorId;

    private Date creationTime;

    private Long updateOperatorId;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getRecentFrequencyId() {
        return recentFrequencyId;
    }

    public void setRecentFrequencyId(Long recentFrequencyId) {
        this.recentFrequencyId = recentFrequencyId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Long getUpdateOperatorId() {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(Long updateOperatorId) {
        this.updateOperatorId = updateOperatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}