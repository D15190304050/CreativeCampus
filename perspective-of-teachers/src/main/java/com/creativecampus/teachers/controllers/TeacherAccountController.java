package com.creativecampus.teachers.controllers;

import com.creativecampus.teachers.api.ITeacherAccountService;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/teachers")
@Slf4j
public class TeacherAccountController
{
    @Autowired
    private ITeacherAccountService teacherAccountService;

    @RequestMapping("/register")
    @ResponseBody
    public ServiceResponse<Boolean> register(@RequestBody Teacher teacher)
    {
        return teacherAccountService.registerTeacher(teacher);
    }

    @RequestMapping("/login")
    @ResponseBody
    public ServiceResponse<Teacher> login(@RequestBody Teacher teacher, HttpSession session)
    {
        return teacherAccountService.login(teacher, session);
    }

    @RequestMapping("/logout")
    @ResponseBody
    public ServiceResponse<Boolean> logout(HttpSession session)
    {
        return teacherAccountService.logout(session);
    }
}
