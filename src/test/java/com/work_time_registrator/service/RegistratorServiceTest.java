package com.work_time_registrator.service;

import com.work_time_registrator.model.User;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.work_time_registrator.TestData.*;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class RegistratorServiceTest {

    @Autowired
    protected RegistratorService registratorService;

    @Test
    public void getUserById() throws Exception {
        User actual = registratorService.getUserById(100000);
        org.assertj.core.api.Assertions.assertThat(actual).isEqualToComparingFieldByField(USER1);
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void setStartWorkTime() throws Exception {
    }

    @Test
    public void getStartWorkTime() throws Exception {
    }

    @Test
    public void isAtWork() throws Exception {
    }

    @Test
    public void setATWork() throws Exception {
    }

}