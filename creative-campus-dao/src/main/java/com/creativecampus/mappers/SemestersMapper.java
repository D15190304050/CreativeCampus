package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Semesters;
import java.util.List;

public interface SemestersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Semesters record);

    Semesters selectByPrimaryKey(Long id);

    List<Semesters> selectAll();

    int updateByPrimaryKey(Semesters record);
}