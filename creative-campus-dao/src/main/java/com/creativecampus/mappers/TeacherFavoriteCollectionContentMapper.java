package com.creativecampus.mappers;

import com.creativecampus.commons.domain.TeacherFavoriteCollectionContent;
import java.util.List;

public interface TeacherFavoriteCollectionContentMapper
{
    int deleteByPrimaryKey(long id);

    int insert(TeacherFavoriteCollectionContent record);

    TeacherFavoriteCollectionContent selectByPrimaryKey(long id);

    List<TeacherFavoriteCollectionContent> selectAll();

    int updateByPrimaryKey(TeacherFavoriteCollectionContent record);
}