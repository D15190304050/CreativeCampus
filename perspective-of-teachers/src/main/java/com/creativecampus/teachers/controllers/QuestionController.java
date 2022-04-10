package com.creativecampus.teachers.controllers;

import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Question;
import com.creativecampus.commons.domain.QuestionType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/questions")
public class QuestionController
{
    @RequestMapping("/getQuestionTypes")
    public ServiceResponse<List<QuestionType>> getQuestionTypes()
    {
        return null;
    }

    @RequestMapping("/addQuestion")
    @ResponseBody
    public ServiceResponse<Object> addQuestion(@RequestBody Question question)
    {
        return null;
    }
}
