package com.creativecampus.mappers;

import com.creativecampus.commons.domain.RecentFrequencies;
import java.util.List;

public interface RecentFrequenciesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RecentFrequencies record);

    RecentFrequencies selectByPrimaryKey(Long id);

    List<RecentFrequencies> selectAll();

    int updateByPrimaryKey(RecentFrequencies record);
}