package com.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;

import com.exception.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
//     @Modifying
//     @Transactional
//     @Query("Delete From Student where firstName = :firstName")
//     Integer deleteByFirstName (String firstName);
}
