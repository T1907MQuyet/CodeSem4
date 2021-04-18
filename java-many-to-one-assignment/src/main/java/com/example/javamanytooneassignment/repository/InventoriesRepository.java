package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Inventories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoriesRepository extends JpaRepository<Inventories,Integer> {
}
