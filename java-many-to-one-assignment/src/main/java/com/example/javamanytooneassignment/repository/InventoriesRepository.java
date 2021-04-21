package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Inventories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InventoriesRepository extends JpaRepository<Inventories,Integer> {
}
