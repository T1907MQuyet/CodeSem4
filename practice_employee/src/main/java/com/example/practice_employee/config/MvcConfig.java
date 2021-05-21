package com.example.practice_employee.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MvcConfig {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
        exposeDirectory("uploadingDir",registry);

    }
    private void exposeDirectory(String dirName, ResourceHandlerRegistry registry)
    {
        Path uploadDir = Paths.get(dirName);
        String uploadPath = uploadDir.toFile().getAbsolutePath();
        if(dirName.startsWith("../"))dirName = dirName.replace("../","");
        registry.addResourceHandler("/"+dirName+"/**").addResourceLocations("file:/"+uploadPath+"/");
    }
}
