package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Locations,Integer> {
}
