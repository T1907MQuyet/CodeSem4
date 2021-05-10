package com.example.practicalapplicationemi.repository;

import com.example.practicalapplicationemi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
