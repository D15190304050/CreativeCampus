package com.creativecampus.mappers;

import com.creativecampus.commons.domain.VisitTypes;
import java.util.List;

public interface VisitTypesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VisitTypes record);

    VisitTypes selectByPrimaryKey(Long id);

    List<VisitTypes> selectAll();

    int updateByPrimaryKey(VisitTypes record);
}