package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Disciplines;
import java.util.List;

public interface DisciplineMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Disciplines record);

    Disciplines selectByPrimaryKey(long id);

    List<Disciplines> selectAll();

    int updateByPrimaryKey(Disciplines record);
}