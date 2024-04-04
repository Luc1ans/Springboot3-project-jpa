package com.MundoDesign.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MundoDesign.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
