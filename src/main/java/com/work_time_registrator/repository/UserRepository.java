package com.work_time_registrator.repository;

import com.work_time_registrator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    User save(User s);

    @Override
    User findOne(Integer integer);

    @Override
    boolean exists(Integer integer);

    @Override
    List<User> findAll();

    @Override
    void delete(Integer integer);

    @Override
    void deleteAll();


    //
//    @Transactional
//    User getUserById(int userId);
//
//    @Override
//    @Transactional
//    User save(User user);




//    @Query("SELECT u FROM User u WHERE u.id = ?1 and m.user.id = ?2")
//    LocalDateTime get;
//    void terminateWork();
//    void endWork();
//    User getUserByEmail();
//    int getFullWorkTime();
//    boolean isAtWork();
//    LocalDateTime getLocalDateTime();
//    void setATWork();



}
