package com.creativecampus.mappers;

import com.creativecampus.commons.domain.VisitType;
import java.util.List;

public interface VisitTypeMapper
{
    int deleteByPrimaryKey(long id);

    int insert(VisitType record);

    VisitType selectByPrimaryKey(long id);

    List<VisitType> selectAll();

    int updateByPrimaryKey(VisitType record);
}