package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Semester;
import java.util.List;

public interface SemesterMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Semester record);

    Semester selectByPrimaryKey(long id);

    List<Semester> selectAll();

    int updateByPrimaryKey(Semester record);
}