package com.creativecampus.commons.domain;

import java.util.Date;

public class Question
{
    private long id;

    private int sourceTypeId;

    private String sourceTypeText;

    private long questionTypeId;

    private String questionTypeText;

    private long difficultyTypeId;

    private String difficultyTypeText;

    private String questionBodyUrl;

    private long disciplineId;

    private String disciplineText;

    private String answerBodyUrl;

    private int estimatedTimeToFinish;

    private String tag;

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

    public int getSourceTypeId()
    {
        return sourceTypeId;
    }

    public void setSourceTypeId(int sourceTypeId)
    {
        this.sourceTypeId = sourceTypeId;
    }

    public long getQuestionTypeId()
    {
        return questionTypeId;
    }

    public void setQuestionTypeId(long questionTypeId)
    {
        this.questionTypeId = questionTypeId;
    }

    public long getDifficultyTypeId()
    {
        return difficultyTypeId;
    }

    public void setDifficultyTypeId(long difficultyTypeId)
    {
        this.difficultyTypeId = difficultyTypeId;
    }

    public String getQuestionBodyUrl()
    {
        return questionBodyUrl;
    }

    public void setQuestionBodyUrl(String questionBodyUrl)
    {
        this.questionBodyUrl = questionBodyUrl == null ? null : questionBodyUrl.trim();
    }

    public long getDisciplineId()
    {
        return disciplineId;
    }

    public void setDisciplineId(long disciplineId)
    {
        this.disciplineId = disciplineId;
    }

    public String getAnswerBodyUrl()
    {
        return answerBodyUrl;
    }

    public void setAnswerBodyUrl(String answerBodyUrl)
    {
        this.answerBodyUrl = answerBodyUrl == null ? null : answerBodyUrl.trim();
    }

    public int getEstimatedTimeToFinish()
    {
        return estimatedTimeToFinish;
    }

    public void setEstimatedTimeToFinish(int estimatedTimeToFinish)
    {
        this.estimatedTimeToFinish = estimatedTimeToFinish;
    }

    public String getTag()
    {
        return tag;
    }

    public void setTag(String tag)
    {
        this.tag = tag == null ? null : tag.trim();
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

    public String getSourceTypeText()
    {
        return sourceTypeText;
    }

    public void setSourceTypeText(String sourceTypeText)
    {
        this.sourceTypeText = sourceTypeText;
    }

    public String getQuestionTypeText()
    {
        return questionTypeText;
    }

    public void setQuestionTypeText(String questionTypeText)
    {
        this.questionTypeText = questionTypeText;
    }

    public String getDifficultyTypeText()
    {
        return difficultyTypeText;
    }

    public void setDifficultyTypeText(String difficultyTypeText)
    {
        this.difficultyTypeText = difficultyTypeText;
    }

    public String getDisciplineText()
    {
        return disciplineText;
    }

    public void setDisciplineText(String disciplineText)
    {
        this.disciplineText = disciplineText;
    }
}