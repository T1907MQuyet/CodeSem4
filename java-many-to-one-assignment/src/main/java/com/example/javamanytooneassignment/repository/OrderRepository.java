package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Orders,Integer> {
}
