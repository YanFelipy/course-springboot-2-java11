package com.yf.course.entities.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yf.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
