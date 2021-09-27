package com.creativecampus.mappers;

import com.creativecampus.commons.domain.QuestionKnowledgePointRelation;
import java.util.List;

public interface QuestionKnowledgePointRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionKnowledgePointRelation record);

    QuestionKnowledgePointRelation selectByPrimaryKey(Long id);

    List<QuestionKnowledgePointRelation> selectAll();

    int updateByPrimaryKey(QuestionKnowledgePointRelation record);
}