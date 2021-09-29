package com.creativecampus.commons.domain;

import java.util.Date;

public class Questions {
    private Long id;

    private Integer sourceTypeId;

    private Long questionTypeId;

    private Long difficultyTypeId;

    private String questionBodyUrl;

    private Long disciplineId;

    private String answerBodyUrl;

    private Integer estimatedTimeToFinish;

    private String tag;

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

    public Integer getSourceTypeId() {
        return sourceTypeId;
    }

    public void setSourceTypeId(Integer sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
    }

    public Long getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Long questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public Long getDifficultyTypeId() {
        return difficultyTypeId;
    }

    public void setDifficultyTypeId(Long difficultyTypeId) {
        this.difficultyTypeId = difficultyTypeId;
    }

    public String getQuestionBodyUrl() {
        return questionBodyUrl;
    }

    public void setQuestionBodyUrl(String questionBodyUrl) {
        this.questionBodyUrl = questionBodyUrl == null ? null : questionBodyUrl.trim();
    }

    public Long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Long disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getAnswerBodyUrl() {
        return answerBodyUrl;
    }

    public void setAnswerBodyUrl(String answerBodyUrl) {
        this.answerBodyUrl = answerBodyUrl == null ? null : answerBodyUrl.trim();
    }

    public Integer getEstimatedTimeToFinish() {
        return estimatedTimeToFinish;
    }

    public void setEstimatedTimeToFinish(Integer estimatedTimeToFinish) {
        this.estimatedTimeToFinish = estimatedTimeToFinish;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
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