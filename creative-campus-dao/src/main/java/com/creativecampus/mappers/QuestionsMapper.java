package com.creativecampus.mappers;

import com.creativecampus.commons.domain.Questions;
import java.util.List;

public interface QuestionsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Questions record);

    Questions selectByPrimaryKey(Long id);

    List<Questions> selectAll();

    int updateByPrimaryKey(Questions record);
}