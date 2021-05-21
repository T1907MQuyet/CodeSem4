package com.example.practice_employee.service;

import com.example.practice_employee.model.Employee;

import java.util.List;

public interface EmployeeService {
        boolean insertEmp(Employee p);
        List<Employee> getAllEmployee();
        Employee getEmpById(int id);
        boolean updateEmp(Employee p);
        boolean deleteEmp(int id);

}
