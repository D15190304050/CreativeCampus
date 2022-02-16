package com.creativecampus.mappers;

import com.creativecampus.commons.domain.FollowRelation;
import java.util.List;

public interface FollowRelationMapper {
    int deleteByPrimaryKey(long id);

    int insert(FollowRelation record);

    FollowRelation selectByPrimaryKey(long id);

    List<FollowRelation> selectAll();

    int updateByPrimaryKey(FollowRelation record);
}