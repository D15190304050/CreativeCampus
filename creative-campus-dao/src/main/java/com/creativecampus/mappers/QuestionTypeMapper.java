package com.creativecampus.mappers;

import com.creativecampus.commons.domain.QuestionType;
import java.util.List;

public interface QuestionTypeMapper
{
    int deleteByPrimaryKey(long id);

    int insert(QuestionType record);

    QuestionType selectByPrimaryKey(long id);

    List<QuestionType> selectAll();

    int updateByPrimaryKey(QuestionType record);
}