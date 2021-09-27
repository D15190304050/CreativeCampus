package com.creativecampus.mappers;

import com.creativecampus.commons.domain.DifficultyTypes;
import java.util.List;

public interface DifficultyTypesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DifficultyTypes record);

    DifficultyTypes selectByPrimaryKey(Long id);

    List<DifficultyTypes> selectAll();

    int updateByPrimaryKey(DifficultyTypes record);
}