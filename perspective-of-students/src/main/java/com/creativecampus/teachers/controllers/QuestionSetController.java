package com.creativecampus.teachers.controllers;

import com.creativecampus.commons.ServiceResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionSetController
{
    /**
     *
     * @return
     */
    @RequestMapping("/submitQuestionSet")
    @ResponseBody
    public ServiceResponse<Boolean> submitQuestionSet()
    {
        // Get student id (not from request argument).

        return null;
    }
}
