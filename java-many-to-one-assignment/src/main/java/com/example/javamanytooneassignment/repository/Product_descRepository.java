package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Product_descriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Product_descRepository extends JpaRepository<Product_descriptions,Integer> {
}
