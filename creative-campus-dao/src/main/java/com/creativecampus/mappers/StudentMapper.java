package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Student;
import java.util.List;

public interface StudentMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Student record);

    Student selectByPrimaryKey(long id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);
}