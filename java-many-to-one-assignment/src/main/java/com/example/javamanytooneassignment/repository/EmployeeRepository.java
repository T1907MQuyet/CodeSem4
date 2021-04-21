package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
}
