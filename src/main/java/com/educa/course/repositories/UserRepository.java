package com.educa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
