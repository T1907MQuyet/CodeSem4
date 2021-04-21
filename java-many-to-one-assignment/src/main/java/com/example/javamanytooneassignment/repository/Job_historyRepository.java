package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Job_history;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Job_historyRepository extends JpaRepository<Job_history,Integer> {

}
