package com.danielluque.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielluque.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
