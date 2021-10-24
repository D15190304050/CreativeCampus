package com.creativecampus.commons.arguments.validation;

import com.creativecampus.commons.domain.Teacher;
import dataworks.data.json.JsonSerializer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolation;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ArgumentValidatorTest
{
    @Test
    public void getConstraintViolation()
    {

    }
}