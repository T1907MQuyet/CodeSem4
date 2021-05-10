package com.example.practicalapplicationemi.service;

import com.example.practicalapplicationemi.model.Customer;
import com.example.practicalapplicationemi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> getEmiByCust(int cust_id);
    boolean saveEmi(Employee emi);
    boolean updateEmi(Employee emi);

}
