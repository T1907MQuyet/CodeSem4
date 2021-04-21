package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
}
