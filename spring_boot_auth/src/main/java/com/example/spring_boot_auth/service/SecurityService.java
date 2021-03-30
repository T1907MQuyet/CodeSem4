package com.example.spring_boot_auth.service;

public interface SecurityService {
    String finLoggedInUsername();
    void  autoLogin(String username, String password);
}
