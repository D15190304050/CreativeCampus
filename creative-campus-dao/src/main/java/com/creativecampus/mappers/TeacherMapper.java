package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Teacher;
import java.util.List;

public interface TeacherMapper
{
    int deleteByPrimaryKey(Long id);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Long id);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);

    int getCountByAccount(String account);
}