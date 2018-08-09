package com.work_time_registrator.repository;

import com.work_time_registrator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Integer> {


    @Transactional
    User findById(int userId);

    @Override
    @Transactional
    User save(User user);




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
