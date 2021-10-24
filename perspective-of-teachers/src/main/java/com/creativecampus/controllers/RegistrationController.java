package com.creativecampus.controllers;

import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.arguments.logs.LogArguments;
import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.commons.arguments.validation.ArgumentValidation;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/register")
@Slf4j
@LogArguments
public class RegistrationController
{
    @RequestMapping("/registerTeacher")
    @ResponseBody
    public ServiceResponse<Boolean> registerTeacher(@RequestBody Teacher teacher)
    {

        return ServiceResponse.buildSuccessResponse(true);
    }
}
