package com.example.t1907mrestcontronller.repository;

import com.example.t1907mrestcontronller.jpa.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
