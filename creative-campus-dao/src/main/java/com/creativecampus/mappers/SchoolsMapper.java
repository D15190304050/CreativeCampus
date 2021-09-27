package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Schools;
import java.util.List;

public interface SchoolsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Schools record);

    Schools selectByPrimaryKey(Long id);

    List<Schools> selectAll();

    int updateByPrimaryKey(Schools record);
}