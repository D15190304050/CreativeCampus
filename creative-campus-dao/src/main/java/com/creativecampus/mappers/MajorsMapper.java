package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Majors;
import java.util.List;

public interface MajorsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Majors record);

    Majors selectByPrimaryKey(Long id);

    List<Majors> selectAll();

    int updateByPrimaryKey(Majors record);
}