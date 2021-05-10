package com.example.practicalapplicationemi.service;

import com.example.practicalapplicationemi.model.Customer;
import com.example.practicalapplicationemi.repository.CustomerRepository;
import com.example.practicalapplicationemi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class CustomerServiceIpl {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> getAllCustomer() {
        try{
            List<Customer> list = customerRepository.findAll();
            return list;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveCustomer(Customer customer) {
        try{
            customer.setCreated(new Date());
            customerRepository.save(customer);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        try{
            customerRepository.save(customer);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCustomer(int cust_id) {
        try{
            customerRepository.deleteById(cust_id);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Customer getCustById(int cust_id) {
        try{
            Customer customer = customerRepository.findById(cust_id).get();
            return customer;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
