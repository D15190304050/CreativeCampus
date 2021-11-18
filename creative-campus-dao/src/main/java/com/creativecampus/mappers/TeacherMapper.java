package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper
{
    int deleteByPrimaryKey(Long id);

    int insertTeacher(Teacher record);

    Teacher selectByPrimaryKey(Long id);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);

    int getCountByAccount(String account);

    int getCountByAccountAndEncryptedPassword(@Param("account") String account, @Param("encryptedPassword") String encryptedPassword);
}