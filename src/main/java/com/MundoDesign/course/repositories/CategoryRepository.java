package com.MundoDesign.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MundoDesign.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
