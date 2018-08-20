package com.work_time_registrator.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    //public static final int START_SEQ = 100000;

    @Id
    //@SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = START_SEQ)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @Column(name = "email", nullable = false, unique = true)
//    @Email
//    @NotBlank
//    @Size(max = 100)
    private String email;

//    @Column(name = "password", nullable = false)
//    @NotBlank
//    @Size(min = 5, max = 10)
    private String password;

//    @Column
    private LocalDateTime startTime;

    private long fullWorkTime = 0;

    private boolean atWork = false;

    public User() {
    }

    public User(Integer id, String email, String password, LocalDateTime startTime, long fullWorkTime, boolean atWork) {

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

    public Integer getId() {
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

    public boolean isNew(){
        return getId() != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !getClass().equals(User.class)) {
            return false;
        }
        User that = (User) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", startTime=" + startTime +
                ", fullWorkTime=" + fullWorkTime +
                ", atWork=" + atWork +
                '}';
    }
}
