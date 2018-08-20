package com.work_time_registrator.service;

import com.work_time_registrator.model.User;

import java.time.LocalDateTime;
import java.util.List;

public interface Service {

    public User getUserById(int userId);

    public User save(User user);

    public User setStartWorkTime(int userId);

    public LocalDateTime getStartWorkTime(int userId);

    public boolean isAtWork(int userId);

    public void setATWork(int userId, boolean atWork);

    public List<User> getAll();
}
