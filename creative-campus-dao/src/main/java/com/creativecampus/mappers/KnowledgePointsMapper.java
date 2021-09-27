package com.creativecampus.mappers;

import com.creativecampus.commons.domain.KnowledgePoints;
import java.util.List;

public interface KnowledgePointsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgePoints record);

    KnowledgePoints selectByPrimaryKey(Long id);

    List<KnowledgePoints> selectAll();

    int updateByPrimaryKey(KnowledgePoints record);
}