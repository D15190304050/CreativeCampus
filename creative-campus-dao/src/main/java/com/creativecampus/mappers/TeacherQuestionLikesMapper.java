package com.creativecampus.mappers;

import com.creativecampus.commons.domain.TeacherQuestionLikes;
import java.util.List;

public interface TeacherQuestionLikesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TeacherQuestionLikes record);

    TeacherQuestionLikes selectByPrimaryKey(Long id);

    List<TeacherQuestionLikes> selectAll();

    int updateByPrimaryKey(TeacherQuestionLikes record);
}