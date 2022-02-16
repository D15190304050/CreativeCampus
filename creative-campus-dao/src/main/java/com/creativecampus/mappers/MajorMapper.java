package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Major;
import java.util.List;

public interface MajorMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Major record);

    Major selectByPrimaryKey(long id);

    List<Major> selectAll();

    int updateByPrimaryKey(Major record);
}