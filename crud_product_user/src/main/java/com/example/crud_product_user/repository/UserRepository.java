package com.example.crud_product_user.repository;

import com.example.crud_product_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
