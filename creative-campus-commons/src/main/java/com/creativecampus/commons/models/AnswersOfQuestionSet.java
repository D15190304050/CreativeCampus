package com.creativecampus.commons.models;

import com.creativecampus.commons.domain.AnswerOfQuestion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnswersOfQuestionSet
{
    private long questionSetId;
    private long studentId;
    private List<AnswerOfQuestion> answersOfQuestions;
}
