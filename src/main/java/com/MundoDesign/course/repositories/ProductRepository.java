package com.MundoDesign.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MundoDesign.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
