package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Teachers;
import java.util.List;

public interface TeachersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Teachers record);

    Teachers selectByPrimaryKey(Long id);

    List<Teachers> selectAll();

    int updateByPrimaryKey(Teachers record);
}