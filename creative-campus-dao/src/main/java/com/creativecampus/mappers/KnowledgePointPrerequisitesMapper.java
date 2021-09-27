package com.creativecampus.mappers;

import com.creativecampus.commons.domain.KnowledgePointPrerequisites;
import java.util.List;

public interface KnowledgePointPrerequisitesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgePointPrerequisites record);

    KnowledgePointPrerequisites selectByPrimaryKey(Long id);

    List<KnowledgePointPrerequisites> selectAll();

    int updateByPrimaryKey(KnowledgePointPrerequisites record);
}