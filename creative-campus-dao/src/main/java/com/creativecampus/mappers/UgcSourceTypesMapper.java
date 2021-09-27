package com.creativecampus.mappers;

import com.creativecampus.commons.domain.UgcSourceTypes;
import java.util.List;

public interface UgcSourceTypesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UgcSourceTypes record);

    UgcSourceTypes selectByPrimaryKey(Long id);

    List<UgcSourceTypes> selectAll();

    int updateByPrimaryKey(UgcSourceTypes record);
}