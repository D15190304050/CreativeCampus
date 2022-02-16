package com.creativecampus.mappers;

import com.creativecampus.commons.domain.QuestionComment;
import java.util.List;

public interface QuestionCommentMapper
{
    int deleteByPrimaryKey(long id);

    int insert(QuestionComment record);

    QuestionComment selectByPrimaryKey(long id);

    List<QuestionComment> selectAll();

    int updateByPrimaryKey(QuestionComment record);
}