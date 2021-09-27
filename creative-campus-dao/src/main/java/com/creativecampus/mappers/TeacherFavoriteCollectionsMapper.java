package com.creativecampus.mappers;

import com.creativecampus.commons.domain.TeacherFavoriteCollections;
import java.util.List;

public interface TeacherFavoriteCollectionsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TeacherFavoriteCollections record);

    TeacherFavoriteCollections selectByPrimaryKey(Long id);

    List<TeacherFavoriteCollections> selectAll();

    int updateByPrimaryKey(TeacherFavoriteCollections record);
}