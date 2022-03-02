package com.creativecampus.teachers.controllers;

import com.creativecampus.commons.ServiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller@RequestMapping("/marking")
public class TeacherMarkingController
{
    @RequestMapping("/submit")
    @ResponseBody
    public ServiceResponse<Boolean> submitMarkingResultForStudent()
    {
        return null;
    }
}
