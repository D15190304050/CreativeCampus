package com.creativecampus.mappers;

import com.creativecampus.commons.domain.QuestionSetComment;
import java.util.List;

public interface QuestionSetCommentMapper
{
    int deleteByPrimaryKey(long id);

    int insert(QuestionSetComment record);

    QuestionSetComment selectByPrimaryKey(long id);

    List<QuestionSetComment> selectAll();

    int updateByPrimaryKey(QuestionSetComment record);
}