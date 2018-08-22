package com.work_time_registrator.repository;

import com.work_time_registrator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class RegistratorRepository{

    @Autowired
    UserRepository userRepository;

    public User save(User s){

        return userRepository.save(s);
    }

    public User findOne(Integer integer){

        return userRepository.findOne(integer);
    }

    public boolean exists(Integer integer){

        return userRepository.exists(integer);
    }

    public List<User> findAll(){

        return (List<User>)userRepository.findAll();
    }

    public void delete(Integer integer){

        userRepository.delete(integer);
    }

    public void deleteAll(){

        userRepository.deleteAll();
    }
//
//    @Transactional
//    public User getUserById(Integer userId){
//
//        return userRepository.findOne(userId);
//    }
//
//    @Transactional
//    public User save(User user){
//
//        return userRepository.save(user);
//    }

//    public static void main(String[] args) {
//
//        RegistratorRepository registratorRepository = new RegistratorRepository();
//
//        User user = registratorRepository.getUserById(100000);
//        System.out.println(user.toString());
//
//    }


//    @Transactional
//    public User setStartWorkTime(int userId, LocalDateTime localDateTime) {
//
//        User currentUser = userRepository.getUserById(userId);
//        currentUser.setStartTime(localDateTime);
//        return userRepository.save(currentUser);
//    }
//
//    public LocalDateTime getStartWorkTime(int userId) {
//
//        User currentUser = userRepository.getUserById(userId);
//        return currentUser.getStartTime();
//    }
//
//    public void setFullWorkTime(int userId, long time){
//
//        userRepository.getUserById(userId).setFullWorkTime(time);
//    }
//
//
//
//    public long getFullWorkTime(int userId) {
//
//        User currentUser = userRepository.getUserById(userId);
//        return currentUser.getFullWorkTime();
//    }
//
//    public boolean isAtWork(int userId) {
//        User currentUser = userRepository.getUserById(userId);
//        return currentUser.isAtWork();
//    }
//
//    public void setATWork(int userId, boolean atWork) {
//
//        User currentUser = userRepository.getUserById(userId);
//        currentUser.setAtWork(atWork);
//    }

}
