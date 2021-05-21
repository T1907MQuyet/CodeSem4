package com.example.practice_employee.service;

import com.example.practice_employee.model.Employee;
import com.example.practice_employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public boolean insertEmp(Employee p) {
        try{
            employeeRepository.save(p)
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> list = employeeRepository.findAll();
        return list;
    }

    @Override
    public Employee getEmpById(int id) {
        Employee employee = employeeRepository.findById(id).get();
        return employee;
    }

    @Override
    public boolean updateEmp(Employee p) {
        try{
            employeeRepository.save(p);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteEmp(int id) {
        try{
            employeeRepository.deleteById(id);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }


}
