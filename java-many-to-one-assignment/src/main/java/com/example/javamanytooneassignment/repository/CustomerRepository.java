package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Integer> {
}
