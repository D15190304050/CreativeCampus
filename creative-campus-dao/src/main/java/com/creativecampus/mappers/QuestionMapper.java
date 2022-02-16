package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Question;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

public interface QuestionMapper
{
    int deleteByPrimaryKey(long id);

    int insert(Question record);

    Question selectByPrimaryKey(long id);

    int updateByPrimaryKey(Question record);

    List<Question> getQuestionsByDisciplines(@Param("disciplineIds") List<Long> disciplineIds,
                                             @Param("offset") long offset,
                                             @Param("count") long count);
}