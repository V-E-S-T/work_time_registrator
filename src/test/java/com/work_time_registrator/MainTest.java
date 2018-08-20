package com.work_time_registrator;

import com.work_time_registrator.model.User;
import com.work_time_registrator.service.ServiceImpl;

public class MainTest {

    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        User user = service.getUserById(100000);
        System.out.println(user.toString());
    }
}
