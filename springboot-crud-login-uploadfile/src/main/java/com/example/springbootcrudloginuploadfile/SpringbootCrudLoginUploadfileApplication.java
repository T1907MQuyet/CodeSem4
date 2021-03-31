package com.example.springbootcrudloginuploadfile;

import com.example.springbootcrudloginuploadfile.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootCrudLoginUploadfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCrudLoginUploadfileApplication.class, args);
    }
    @Bean(name = "USER_BEAN")
    public User setUser(){
        User u = new User();
        u.setUsername("admin");
        u.setPassword("admin123");
        return  u;
    }

}
