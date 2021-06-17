package com.yf.course.entities.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yf.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	}
