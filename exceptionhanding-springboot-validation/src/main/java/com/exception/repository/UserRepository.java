package com.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exception.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
