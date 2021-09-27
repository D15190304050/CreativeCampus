package com.creativecampus.mappers;

import com.creativecampus.commons.domain.KnowledgePointQuestionLabels;
import java.util.List;

public interface KnowledgePointQuestionLabelsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgePointQuestionLabels record);

    KnowledgePointQuestionLabels selectByPrimaryKey(Long id);

    List<KnowledgePointQuestionLabels> selectAll();

    int updateByPrimaryKey(KnowledgePointQuestionLabels record);
}