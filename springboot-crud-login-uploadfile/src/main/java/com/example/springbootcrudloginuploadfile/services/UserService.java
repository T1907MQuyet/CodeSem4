package com.example.springbootcrudloginuploadfile.services;

import com.example.springbootcrudloginuploadfile.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User entity);

    List<User> saveAll(List<User> entities);

    Optional<User> findById(String s);

    boolean existsById(String s);

    List<User> findAll();

    List<User> findAllById(List<String> ids);

    long count();


    void delete(User user);

    void deleteAll(List<User> entities);

    void deleteAll();
}
