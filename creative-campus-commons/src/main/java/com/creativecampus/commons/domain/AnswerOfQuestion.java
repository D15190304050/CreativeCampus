package com.creativecampus.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnswerOfQuestion
{
    private long id;
    private long studentId;
    private long questionId;
    private long questionTypeNumber;
    private long questionNumber;
    private long questionSetId;
    private String answerText;
    private String richTextAnswerUrl;
    private BigDecimal score;
    private BigDecimal totalScore;
    private BigDecimal normalizedScore;
    private Date creationTime;
    private Date updateTime;
}
