package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Product_information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Product_inRepository extends JpaRepository<Product_information,Integer> {
}
