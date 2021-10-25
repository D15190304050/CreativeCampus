package com.creativecampus.controllers;

import com.creativecampus.api.ITeacherService;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.runtime.LogAndValidate;
import com.creativecampus.commons.domain.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/register")
@Slf4j
public class RegistrationController
{
    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("/registerTeacher")
    @ResponseBody
    public ServiceResponse<Boolean> registerTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.registerTeacher(teacher);
    }
}
