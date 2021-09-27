package com.creativecampus.mappers;

import com.creativecampus.commons.domain.RecentVisits;
import java.util.List;

public interface RecentVisitsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RecentVisits record);

    RecentVisits selectByPrimaryKey(Long id);

    List<RecentVisits> selectAll();

    int updateByPrimaryKey(RecentVisits record);
}