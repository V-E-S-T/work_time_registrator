package com.work_time_registrator.controller;

import com.work_time_registrator.model.User;
import com.work_time_registrator.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    ServiceImpl service;

    @RequestMapping("/")
    public String root()
    {
        return "index";
    }

    @RequestMapping("/users")
    public String users(Model model)
    {
        List<User> users = service.getAll();
        model.addAttribute("users", users);

        return "users";
    }
}
