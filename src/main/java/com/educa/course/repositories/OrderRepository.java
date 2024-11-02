package com.educa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
