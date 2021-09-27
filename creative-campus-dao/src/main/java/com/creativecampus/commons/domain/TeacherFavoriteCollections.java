package com.creativecampus.commons.domain;

import java.util.Date;

public class TeacherFavoriteCollections {
    private Long id;

    private Long teacherId;

    private Long favoriteTypeId;

    private String name;

    private Date creationTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getFavoriteTypeId() {
        return favoriteTypeId;
    }

    public void setFavoriteTypeId(Long favoriteTypeId) {
        this.favoriteTypeId = favoriteTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}