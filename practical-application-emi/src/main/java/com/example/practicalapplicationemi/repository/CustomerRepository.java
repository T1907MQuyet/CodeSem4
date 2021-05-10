package com.example.practicalapplicationemi.repository;

import com.example.practicalapplicationemi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
}
