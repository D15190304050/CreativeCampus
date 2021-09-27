package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Students;
import java.util.List;

public interface StudentsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Students record);

    Students selectByPrimaryKey(Long id);

    List<Students> selectAll();

    int updateByPrimaryKey(Students record);
}