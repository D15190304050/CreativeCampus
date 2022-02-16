package com.creativecampus.commons.domain;

import java.util.Date;

public class RecentVisit
{
    private long id;

    private long teacherId;

    private long visitTypeId;

    private long visitedObjectId;

    private Date time;

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

    public long getVisitTypeId()
    {
        return visitTypeId;
    }

    public void setVisitTypeId(long visitTypeId)
    {
        this.visitTypeId = visitTypeId;
    }

    public long getVisitedObjectId()
    {
        return visitedObjectId;
    }

    public void setVisitedObjectId(long visitedObjectId)
    {
        this.visitedObjectId = visitedObjectId;
    }

    public Date getTime()
    {
        return time;
    }

    public void setTime(Date time)
    {
        this.time = time;
    }
}