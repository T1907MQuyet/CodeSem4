package com.example.crud_product_user.repository;

import com.example.crud_product_user.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("SELECT p FROM Product p WHERE p.pro_name LIKE %?1%")
    List<Product> searchByname(String key);


}
