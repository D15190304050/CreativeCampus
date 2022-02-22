package com.creativecampus.teachers.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
@Slf4j
public class Welcome
{
    @RequestMapping("welcome")
    @ResponseBody
    public String welcome()
    {
        log.info("Enter welcome");
        return "Welcome";
    }
}
