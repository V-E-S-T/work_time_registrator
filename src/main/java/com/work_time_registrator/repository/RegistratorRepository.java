package com.work_time_registrator.repository;

import com.work_time_registrator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Repository
public class RegistratorRepository {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public User setStartWorkTime(int userId, LocalDateTime localDateTime) {

        User currentUser = userRepository.getUserById(userId);
        currentUser.setStartTime(localDateTime);
        return userRepository.save(currentUser);
    }

    public LocalDateTime getStartWorkTime(int userId) {

        User currentUser = userRepository.getUserById(userId);
        return currentUser.getStartTime();
    }


    public User getUserById(int userId) {

        return userRepository.getUserById(userId);
    }

    public long getFullWorkTime(int userId) {

        User currentUser = userRepository.getUserById(userId);
        return currentUser.getFullWorkTime();
    }

    public boolean isAtWork(int userId) {
        User currentUser = userRepository.getUserById(userId);
        return currentUser.isAtWork();
    }

    public void setATWork(int userId, boolean atWork) {

        User currentUser = userRepository.getUserById(userId);
        currentUser.setAtWork(atWork);
    }

}
