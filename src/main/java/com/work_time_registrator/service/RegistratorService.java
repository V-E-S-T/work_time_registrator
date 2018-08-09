package com.work_time_registrator.service;

import com.work_time_registrator.model.User;
import com.work_time_registrator.repository.RegistratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class RegistratorService {

    @Autowired
    private final RegistratorRepository registratorRepository = new RegistratorRepository();

    @Transactional
    public User getUserById(int userId){

        return registratorRepository.getUserById(userId);
    }

    @Transactional
    public User save(User user){

        return registratorRepository.save(user);
    }

    @Transactional
    public User setStartWorkTime(int userId) {

        LocalDateTime startTime = LocalDateTime.now();

        User currentUser = registratorRepository.getUserById(userId);
        currentUser.setStartTime(startTime);
        return currentUser;                                                //TODO проверка на несуществующего юзера
    }

    public LocalDateTime getStartWorkTime(int userId) {

        User currentUser = registratorRepository.getUserById(userId);
        return currentUser.getStartTime();                                //TODO проверка на несуществующего юзера
    }

//    public void setFullWorkTime(int userId, long time){
//
//        userRepository.getUserById(userId).setFullWorkTime(time);
//    }
//
//    public long getFullWorkTime(int userId) {
//
//        User currentUser = userRepository.getUserById(userId);
//        return currentUser.getFullWorkTime();
//    }

    public boolean isAtWork(int userId) {
        User currentUser = registratorRepository.getUserById(userId);
        return currentUser.isAtWork();                                //TODO проверка на несуществующего юзера
    }

    public void setATWork(int userId, boolean atWork) {

        User currentUser = registratorRepository.getUserById(userId);
        currentUser.setAtWork(atWork);                                //TODO проверка на несуществующего юзера
        registratorRepository.save(currentUser);
    }
}
