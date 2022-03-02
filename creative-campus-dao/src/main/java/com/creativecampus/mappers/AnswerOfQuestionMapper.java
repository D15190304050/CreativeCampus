package com.creativecampus.mappers;

import com.creativecampus.commons.domain.AnswerOfQuestion;

import java.util.List;

public interface AnswerOfQuestionMapper
{
    int insertAnswersOfQuestionSet(List<AnswerOfQuestion> answersOfQuestion);
}
