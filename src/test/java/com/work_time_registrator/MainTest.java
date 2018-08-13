package com.work_time_registrator;

import com.work_time_registrator.model.User;
import com.work_time_registrator.service.RegistratorService;

public class MainTest {

    public static void main(String[] args) {
        RegistratorService service = new RegistratorService();
        User user = service.getUserById(100000);
        System.out.println(user.toString());
    }
}
