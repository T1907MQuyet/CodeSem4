package com.example.uploadfilespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class UploadfilespringApplication {

    public static void main(String[] args) {
        new File(UploadingController.uploadingDir).mkdir();
        SpringApplication.run(UploadfilespringApplication.class, args);
    }

}
