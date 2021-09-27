package com.creativecampus.mappers;

import com.creativecampus.commons.domain.FollowRelation;
import java.util.List;

public interface FollowRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FollowRelation record);

    FollowRelation selectByPrimaryKey(Long id);

    List<FollowRelation> selectAll();

    int updateByPrimaryKey(FollowRelation record);
}