package com.creativecampus.mappers;

import com.creativecampus.commons.domain.RecentVisit;
import java.util.List;

public interface RecentVisitMapper
{
    int deleteByPrimaryKey(long id);

    int insert(RecentVisit record);

    RecentVisit selectByPrimaryKey(long id);

    List<RecentVisit> selectAll();

    int updateByPrimaryKey(RecentVisit record);
}