package com.creativecampus.mappers;

import com.creativecampus.commons.domain.DifficultyType;
import java.util.List;

public interface DifficultyTypeMapper
{
    int deleteByPrimaryKey(long id);

    int insert(DifficultyType record);

    DifficultyType selectByPrimaryKey(long id);

    List<DifficultyType> selectAll();

    int updateByPrimaryKey(DifficultyType record);
}