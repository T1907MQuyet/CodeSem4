package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Warehouses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WatehousesRepository extends JpaRepository<Warehouses,Integer> {
}
