package com.creativecampus.commons.domain;

import java.util.Date;

public class RecentVisits {
    private Long id;

    private Long teacherId;

    private Long visitTypeId;

    private Long visitedObjectId;

    private Date time;

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

    public Long getVisitTypeId() {
        return visitTypeId;
    }

    public void setVisitTypeId(Long visitTypeId) {
        this.visitTypeId = visitTypeId;
    }

    public Long getVisitedObjectId() {
        return visitedObjectId;
    }

    public void setVisitedObjectId(Long visitedObjectId) {
        this.visitedObjectId = visitedObjectId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}