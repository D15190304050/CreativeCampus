package com.creativecampus.controllers;

import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.commons.validation.ArgumentValidation;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/register")
@Slf4j
public class RegistrationController
{
    @RequestMapping("/registerTeacher")
    @ResponseBody
    @ArgumentValidation
    public ServiceResponse<Boolean> registerTeacher(@RequestBody Teacher teacher)
    {
        log.info("teacher = " + JsonSerializer.serialize(teacher));

        return ServiceResponse.buildSuccessResponse(true);
    }
}
