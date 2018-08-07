package model;

import java.time.LocalDateTime;

public class User {

    private int id;
    private String email;
    private String password;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long fullWorkTime = 0;
    private boolean atWork = false;

    public User() {
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

    public LocalDateTime getEndTime() {
        return endTime;
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

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setFullWorkTime(long fullWorkTime) {
        this.fullWorkTime = fullWorkTime;
    }

    public void setAtWork(boolean atWork) {
        this.atWork = atWork;
    }
}
