package com.work_time_registrator.service;

import com.work_time_registrator.model.User;
import com.work_time_registrator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServiceImpl implements com.work_time_registrator.service.Service{


    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User getUserById(int userId){

        return userRepository.findOne(userId);
    }

    @Override
    @Transactional
    public User save(User user){

        return userRepository.save(user);
    }

    @Override
    @Transactional
    public User setStartWorkTime(int userId) {

        LocalDateTime startTime = LocalDateTime.now();

        User currentUser = userRepository.findOne(userId);
        currentUser.setStartTime(startTime);
        return currentUser;                                                //TODO проверка на несуществующего юзера
    }

    @Override
    public LocalDateTime getStartWorkTime(int userId) {

        User currentUser = userRepository.findOne(userId);
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

    @Override
    public boolean isAtWork(int userId) {
        User currentUser = userRepository.findOne(userId);
        return currentUser.isAtWork();                                //TODO проверка на несуществующего юзера
    }

    @Override
    public void setATWork(int userId, boolean atWork) {

        User currentUser = userRepository.findOne(userId);
        currentUser.setAtWork(atWork);                                //TODO проверка на несуществующего юзера
        userRepository.save(currentUser);
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }
}
