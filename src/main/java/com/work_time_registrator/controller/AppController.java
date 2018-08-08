package com.work_time_registrator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @RequestMapping("/")
    @ResponseBody
    String hello()
    {
        return "Spring Boot Worked!";
    }
}
