package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LocationRepository extends JpaRepository<Locations,Integer> {
}
