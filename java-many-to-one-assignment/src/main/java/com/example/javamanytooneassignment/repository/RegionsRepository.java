package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionsRepository extends JpaRepository<Regions,Integer> {
}
