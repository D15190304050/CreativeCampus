package com.creativecampus.controllers;

import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.arguments.LogAndValidate;
import com.creativecampus.commons.arguments.logs.LogArguments;
import com.creativecampus.commons.domain.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/register")
@Slf4j
@LogAndValidate
public class RegistrationController
{
    @RequestMapping("/registerTeacher")
    @ResponseBody
    public ServiceResponse<Boolean> registerTeacher(@RequestBody Teacher teacher)
    {
        return ServiceResponse.buildSuccessResponse(true);
    }
}
