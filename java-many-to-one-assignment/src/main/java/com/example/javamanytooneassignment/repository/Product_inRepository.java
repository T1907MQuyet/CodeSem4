package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Product_information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_inRepository extends JpaRepository<Product_information,Integer> {
}
