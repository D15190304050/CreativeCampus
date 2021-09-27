package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Disciplines;
import java.util.List;

public interface DisciplinesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Disciplines record);

    Disciplines selectByPrimaryKey(Long id);

    List<Disciplines> selectAll();

    int updateByPrimaryKey(Disciplines record);
}