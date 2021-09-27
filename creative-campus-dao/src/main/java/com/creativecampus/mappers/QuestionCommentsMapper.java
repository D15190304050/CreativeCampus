package com.creativecampus.mappers;

import com.creativecampus.commons.domain.QuestionComments;
import java.util.List;

public interface QuestionCommentsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionComments record);

    QuestionComments selectByPrimaryKey(Long id);

    List<QuestionComments> selectAll();

    int updateByPrimaryKey(QuestionComments record);
}