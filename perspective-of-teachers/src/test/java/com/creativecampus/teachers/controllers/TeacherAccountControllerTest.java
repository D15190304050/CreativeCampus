package com.creativecampus.teachers.controllers;

import com.creativecampus.commons.ServiceResponse;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TeacherAccountControllerTest
{
    @Autowired
    private TeacherAccountController teacherAccountController;

    @Test
    public void registerTeacher()
    {
//        ServiceResponse<Boolean> response = registrationController.registerTeacher(null);
//        log.info("response = " + JsonSerializer.serialize(response));

        log.info("Start test...");
        try
        {
            ServiceResponse<Boolean> response = teacherAccountController.register(null);
            log.info("response = " + JsonSerializer.serialize(response));
        }
        catch (Throwable ignored)
        {
            log.error("Error when testing...");
        }
    }
}