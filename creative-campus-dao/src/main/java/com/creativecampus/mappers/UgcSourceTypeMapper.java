package com.creativecampus.mappers;

import com.creativecampus.commons.domain.UgcSourceType;
import java.util.List;

public interface UgcSourceTypeMapper
{
    int deleteByPrimaryKey(long id);

    int insert(UgcSourceType record);

    UgcSourceType selectByPrimaryKey(long id);

    List<UgcSourceType> selectAll();

    int updateByPrimaryKey(UgcSourceType record);
}