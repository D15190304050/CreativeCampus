package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Grades;
import java.util.List;

public interface GradesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Grades record);

    Grades selectByPrimaryKey(Long id);

    List<Grades> selectAll();

    int updateByPrimaryKey(Grades record);
}