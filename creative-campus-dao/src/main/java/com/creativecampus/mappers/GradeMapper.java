package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Grades;
import java.util.List;

public interface GradeMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Grades record);

    Grades selectByPrimaryKey(long id);

    List<Grades> selectAll();

    int updateByPrimaryKey(Grades record);
}