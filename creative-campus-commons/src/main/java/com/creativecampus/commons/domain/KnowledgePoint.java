package com.creativecampus.commons.domain;

import java.util.Date;

public class KnowledgePoint
{
    private long id;

    private long disciplineId;

    private String name;

    private String descriptionUrl;

    private long gradeId;

    private long semesterId;

    private Double frequencyOfExams;

    private long creatorId;

    private Date creationTime;

    private long updateOperatorId;

    private Date updateTime;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getDisciplineId()
    {
        return disciplineId;
    }

    public void setDisciplineId(long disciplineId)
    {
        this.disciplineId = disciplineId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name == null ? null : name.trim();
    }

    public String getDescriptionUrl()
    {
        return descriptionUrl;
    }

    public void setDescriptionUrl(String descriptionUrl)
    {
        this.descriptionUrl = descriptionUrl == null ? null : descriptionUrl.trim();
    }

    public long getGradeId()
    {
        return gradeId;
    }

    public void setGradeId(long gradeId)
    {
        this.gradeId = gradeId;
    }

    public long getSemesterId()
    {
        return semesterId;
    }

    public void setSemesterId(long semesterId)
    {
        this.semesterId = semesterId;
    }

    public Double getFrequencyOfExams()
    {
        return frequencyOfExams;
    }

    public void setFrequencyOfExams(Double frequencyOfExams)
    {
        this.frequencyOfExams = frequencyOfExams;
    }

    public long getCreatorId()
    {
        return creatorId;
    }

    public void setCreatorId(long creatorId)
    {
        this.creatorId = creatorId;
    }

    public Date getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(Date creationTime)
    {
        this.creationTime = creationTime;
    }

    public long getUpdateOperatorId()
    {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(long updateOperatorId)
    {
        this.updateOperatorId = updateOperatorId;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }
}