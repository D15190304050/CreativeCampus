package com.creativecampus.mappers;

import com.creativecampus.commons.domain.RecentFrequency;
import java.util.List;

public interface RecentFrequencyMapper
{
    int deleteByPrimaryKey(long id);

    int insert(RecentFrequency record);

    RecentFrequency selectByPrimaryKey(long id);

    List<RecentFrequency> selectAll();

    int updateByPrimaryKey(RecentFrequency record);
}