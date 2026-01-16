package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	   User findByEmail(String email);
	}