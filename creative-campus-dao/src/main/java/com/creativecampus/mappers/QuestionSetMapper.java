package com.creativecampus.mappers;

import com.creativecampus.commons.domain.QuestionSet;
import java.util.List;

public interface QuestionSetMapper
{
    int deleteByPrimaryKey(long id);

    int insert(QuestionSet record);

    QuestionSet selectByPrimaryKey(long id);

    List<QuestionSet> selectAll();

    int updateByPrimaryKey(QuestionSet record);
}