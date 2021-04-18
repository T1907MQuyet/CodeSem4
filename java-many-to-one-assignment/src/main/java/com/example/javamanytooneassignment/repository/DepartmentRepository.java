package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Departments,Integer> {
}
