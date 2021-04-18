package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
}
