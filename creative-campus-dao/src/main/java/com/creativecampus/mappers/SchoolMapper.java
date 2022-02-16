package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Schools;
import java.util.List;

public interface SchoolMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Schools record);

    Schools selectByPrimaryKey(long id);

    List<Schools> selectAll();

    int updateByPrimaryKey(Schools record);
}