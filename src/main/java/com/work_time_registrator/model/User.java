package com.work_time_registrator.model;

import java.time.LocalDateTime;

public class User {

    private int id;
    private String email;
    private String password;
    private LocalDateTime startTime;
    private long fullWorkTime = 0;
    private boolean atWork = false;

    public User() {
    }

    public User(int id, String email, String password, LocalDateTime startTime, long fullWorkTime, boolean atWork) {

        this.id = id;
        this.email = email;
        this.password = password;
        this.startTime = startTime;
        this.fullWorkTime = fullWorkTime;
        this.atWork = atWork;
    }

    public User(User u) {
        this(u.id, u.email, u.password, u.startTime, u.fullWorkTime, u.atWork);
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public long getFullWorkTime() {
        return fullWorkTime;
    }

    public boolean isAtWork() {
        return atWork;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setFullWorkTime(long fullWorkTime) {
        this.fullWorkTime = fullWorkTime;
    }

    public void setAtWork(boolean atWork) {
        this.atWork = atWork;
    }
}
