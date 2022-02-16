package com.creativecampus.mappers;

import com.creativecampus.commons.domain.KnowledgePointQuestionLabel;

import java.util.List;

public interface KnowledgePointQuestionLabelMapper
{
    int deleteByPrimaryKey(long id);

    int insert(KnowledgePointQuestionLabel record);

    KnowledgePointQuestionLabel selectByPrimaryKey(long id);

    List<KnowledgePointQuestionLabel> selectAll();

    int updateByPrimaryKey(KnowledgePointQuestionLabel record);
}