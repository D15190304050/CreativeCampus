package com.creativecampus.commons.models;

import java.util.List;

public class QuestionSetRequest
{
    private long questionSetId;
    private List<AnswerOfQuestion> answersOfQuestions;

    public long getQuestionSetId()
    {
        return questionSetId;
    }

    public void setQuestionSetId(long questionSetId)
    {
        this.questionSetId = questionSetId;
    }

    public List<AnswerOfQuestion> getAnswersOfQuestions()
    {
        return answersOfQuestions;
    }

    public void setAnswersOfQuestions(List<AnswerOfQuestion> answersOfQuestions)
    {
        this.answersOfQuestions = answersOfQuestions;
    }
}
