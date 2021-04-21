package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JobRepository extends JpaRepository<Jobs,Integer> {
}
