package com.MundoDesign.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MundoDesign.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
