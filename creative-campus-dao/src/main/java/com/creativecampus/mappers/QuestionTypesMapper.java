package com.creativecampus.mappers;

import com.creativecampus.commons.domain.QuestionTypes;
import java.util.List;

public interface QuestionTypesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(QuestionTypes record);

    QuestionTypes selectByPrimaryKey(Long id);

    List<QuestionTypes> selectAll();

    int updateByPrimaryKey(QuestionTypes record);
}