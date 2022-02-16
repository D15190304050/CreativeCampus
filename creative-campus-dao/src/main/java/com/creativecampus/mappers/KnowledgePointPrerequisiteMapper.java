package com.creativecampus.mappers;

import com.creativecampus.commons.domain.KnowledgePointPrerequisite;
import java.util.List;

public interface KnowledgePointPrerequisiteMapper
{
    int deleteByPrimaryKey(long id);

    int insert(KnowledgePointPrerequisite record);

    KnowledgePointPrerequisite selectByPrimaryKey(long id);

    List<KnowledgePointPrerequisite> selectAll();

    int updateByPrimaryKey(KnowledgePointPrerequisite record);
}