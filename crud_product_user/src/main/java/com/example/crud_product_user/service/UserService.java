package com.example.crud_product_user.service;

import com.example.crud_product_user.model.User;


import java.util.List;

public interface UserService {
    User save(User user);
    User findByUsername(String username);
    List<User> getAllUser();
    User getUserById(long id);
    boolean updateUser(User user);
}
