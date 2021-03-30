package com.example.spring_boot_auth.service;

import com.example.spring_boot_auth.model.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    void  save(User user);

    User finByUsername(String username);
}
