package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegionsRepository extends JpaRepository<Regions,Integer> {
}
