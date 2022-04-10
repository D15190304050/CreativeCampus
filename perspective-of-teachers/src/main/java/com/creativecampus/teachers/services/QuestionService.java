package com.creativecampus.teachers.services;

import com.creativecampus.commons.LogicOnly;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.QuestionType;
import com.creativecampus.mappers.QuestionTypeMapper;
import com.creativecampus.teachers.api.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService
{
    @Autowired
    private QuestionTypeMapper questionTypeMapper;

    @LogicOnly
    public ServiceResponse<List<QuestionType>> getQuestionTypes()
    {
        List<QuestionType> questionTypes = questionTypeMapper.selectAll();
        return ServiceResponse.buildSuccessResponse(questionTypes);
    }


}
