package com.creativecampus.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

    private String standardAnswerUrl;

    private int answerType;

    private int estimatedTimeToFinish;

    private String tag;

    private long creatorId;

    private Date creationTime;

    private long updateOperatorId;

    private Date updateTime;
}