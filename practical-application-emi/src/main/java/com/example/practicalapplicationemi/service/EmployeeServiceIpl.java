package com.example.practicalapplicationemi.service;


import com.example.practicalapplicationemi.model.Customer;
import com.example.practicalapplicationemi.model.Employee;
import com.example.practicalapplicationemi.repository.CustomerRepository;
import com.example.practicalapplicationemi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeServiceIpl {
    @Autowired
    private EmployeeRepository emiRepository;

    @Override
    public List<Employee> getEmiByCust(int cust_id) {
        try{
            List<Employee> list = emiRepository.getEmiByCust(cust_id);
            return list;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveEmi(Employee emi) {
        try{
            emi.setCreated(new Date());
            emi.setUpdated(new Date());
            emiRepository.save(emi);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateEmi(Employee emi) {
        try{
            emi.setUpdated(new Date());
            emiRepository.save(emi);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
