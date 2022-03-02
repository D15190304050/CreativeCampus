package com.creativecampus.teachers.controllers;

import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.models.AnswersOfQuestionSet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionSetController
{
    /**
     *
     * @return
     */
    @RequestMapping("/submitAnswer")
    @ResponseBody
    public ServiceResponse<Boolean> submitAnswersOfQuestionSet(@RequestBody AnswersOfQuestionSet answersOfQuestionSet)
    {
        long studentId = answersOfQuestionSet.getStudentId();
        long questionSetId = answersOfQuestionSet.getQuestionSetId();



        return null;
    }
}
