package com.creativecampus.mappers;

import com.creativecampus.commons.domain.TeacherFavoriteCollection;
import java.util.List;

public interface TeacherFavoriteCollectionMapper
{
    int deleteByPrimaryKey(long id);

    int insert(TeacherFavoriteCollection record);

    TeacherFavoriteCollection selectByPrimaryKey(long id);

    List<TeacherFavoriteCollection> selectAll();

    int updateByPrimaryKey(TeacherFavoriteCollection record);
}