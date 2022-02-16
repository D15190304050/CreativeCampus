package com.creativecampus.commons.domain;

public class QuestionKnowledgePointRelation {
    private long id;

    private long questionId;

    private long knowledgePointId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public long getKnowledgePointId() {
        return knowledgePointId;
    }

    public void setKnowledgePointId(long knowledgePointId) {
        this.knowledgePointId = knowledgePointId;
    }
}