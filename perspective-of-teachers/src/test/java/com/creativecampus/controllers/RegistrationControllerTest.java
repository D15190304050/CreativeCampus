package com.creativecampus.controllers;

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
public class RegistrationControllerTest
{
    @Autowired
    private RegistrationController registrationController;

    @Test
    public void registerTeacher()
    {
        ServiceResponse<Boolean> response = registrationController.registerTeacher(null);
        log.info("response = " + JsonSerializer.serialize(response));
    }
}