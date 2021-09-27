package com.creativecampus.mappers;

import com.creativecampus.commons.domain.TeacherFavoriteCollectionContents;
import java.util.List;

public interface TeacherFavoriteCollectionContentsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TeacherFavoriteCollectionContents record);

    TeacherFavoriteCollectionContents selectByPrimaryKey(Long id);

    List<TeacherFavoriteCollectionContents> selectAll();

    int updateByPrimaryKey(TeacherFavoriteCollectionContents record);
}