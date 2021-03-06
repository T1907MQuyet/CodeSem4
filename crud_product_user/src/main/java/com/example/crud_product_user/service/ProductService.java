package com.example.crud_product_user.service;

import com.example.crud_product_user.model.Product;


import java.util.List;

public interface ProductService {
    boolean insertPro(Product p);
    List<Product> getAllProduct();
    Product getProById(int id);
    boolean updatePro(Product p);
    boolean deletePro(int id);
    List<Product> searchProByName(String key);
}
