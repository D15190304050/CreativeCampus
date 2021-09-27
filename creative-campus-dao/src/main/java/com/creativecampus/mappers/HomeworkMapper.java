package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Homework;
import java.util.List;

public interface HomeworkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Homework record);

    Homework selectByPrimaryKey(Long id);

    List<Homework> selectAll();

    int updateByPrimaryKey(Homework record);
}