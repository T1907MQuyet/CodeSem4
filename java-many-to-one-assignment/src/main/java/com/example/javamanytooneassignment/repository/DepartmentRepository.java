package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartmentRepository  extends JpaRepository<Departments,Integer> {
}
