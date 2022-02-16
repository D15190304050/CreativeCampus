package com.creativecampus.mappers;

import com.creativecampus.commons.domain.TeacherQuestionLike;
import java.util.List;

public interface TeacherQuestionLikeMapper
{
    int deleteByPrimaryKey(long id);

    int insert(TeacherQuestionLike record);

    TeacherQuestionLike selectByPrimaryKey(long id);

    List<TeacherQuestionLike> selectAll();

    int updateByPrimaryKey(TeacherQuestionLike record);
}