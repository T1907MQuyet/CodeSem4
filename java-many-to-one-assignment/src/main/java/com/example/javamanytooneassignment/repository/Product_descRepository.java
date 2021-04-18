package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Product_descriptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_descRepository extends JpaRepository<Product_descriptions,Integer> {
}
