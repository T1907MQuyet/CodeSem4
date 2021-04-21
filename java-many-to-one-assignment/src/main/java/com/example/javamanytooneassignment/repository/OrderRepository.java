package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository  extends JpaRepository<Orders,Integer> {
}
