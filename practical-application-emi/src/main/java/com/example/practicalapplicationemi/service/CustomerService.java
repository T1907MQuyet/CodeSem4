package com.example.practicalapplicationemi.service;

import com.example.practicalapplicationemi.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> getAllCustomer();
    boolean saveCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(int cust_id);
    Customer getCustById(int cust_id);
}
