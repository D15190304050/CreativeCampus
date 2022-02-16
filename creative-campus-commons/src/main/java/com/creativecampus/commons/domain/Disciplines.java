package com.creativecampus.commons.domain;

import java.util.Date;

public class Disciplines {
    private long id;

    private String name;

    private String description;

    private long parentDisciplineId;

    private int level;

    private long creatorId;

    private Date creationTime;

    private long updateOperatorId;

    private Date updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public long getParentDisciplineId() {
        return parentDisciplineId;
    }

    public void setParentDisciplineId(long parentDisciplineId) {
        this.parentDisciplineId = parentDisciplineId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public long getUpdateOperatorId() {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(long updateOperatorId) {
        this.updateOperatorId = updateOperatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}