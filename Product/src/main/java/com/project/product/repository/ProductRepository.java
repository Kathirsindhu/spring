package com.project.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
