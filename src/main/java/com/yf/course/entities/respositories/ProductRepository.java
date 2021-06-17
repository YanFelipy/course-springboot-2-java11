package com.yf.course.entities.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yf.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	}
