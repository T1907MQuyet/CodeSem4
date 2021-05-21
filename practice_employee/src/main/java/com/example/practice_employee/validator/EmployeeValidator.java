package com.example.practice_employee.validator;

import com.example.practice_employee.model.Employee;
import com.example.practice_employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class EmployeeValidator {
    @Autowired
    private EmployeeService employeeService;



    @Override
    public void validate(Object target, Errors errors) {
        Employee pro = (Employee) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"full_name","NotEmpty.emp.full_name");

    }
}
