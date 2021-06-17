package com.yf.course.entities.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yf.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	}
