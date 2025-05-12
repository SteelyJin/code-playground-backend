package com.codeplayground.backend.repository;

import  com.codeplayground.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
