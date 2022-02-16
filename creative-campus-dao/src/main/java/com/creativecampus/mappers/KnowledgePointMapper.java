package com.creativecampus.mappers;

import com.creativecampus.commons.domain.KnowledgePoint;
import java.util.List;

public interface KnowledgePointMapper
{
    int deleteByPrimaryKey(long id);

    int insert(KnowledgePoint record);

    KnowledgePoint selectByPrimaryKey(long id);

    List<KnowledgePoint> selectAll();

    int updateByPrimaryKey(KnowledgePoint record);
}