package com.creativecampus.controller;

import com.creativecampus.commons.CommonFailureResponses;
import com.creativecampus.commons.ControllerResponse;
import com.creativecampus.commons.Validator;
import com.creativecampus.commons.domain.Teacher;
import dataworks.OutString;
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
    public ControllerResponse<Boolean> registerTeacher(@RequestBody Teacher teacher)
    {
        log.info("teacher = " + JsonSerializer.serialize(teacher));

        return ControllerResponse.buildSuccessResponse(true);
    }
}
