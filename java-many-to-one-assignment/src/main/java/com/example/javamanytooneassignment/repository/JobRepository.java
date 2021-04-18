package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Jobs,Integer> {
}
