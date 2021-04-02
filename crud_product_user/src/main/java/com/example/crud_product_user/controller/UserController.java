package com.example.crud_product_user.controller;


import com.example.crud_product_user.model.User;
import com.example.crud_product_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/usermodel")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "")
    public String getAllUser(Model model)
    {
        List<User> list = userService.getAllUser();
        model.addAttribute("list",list);

        return "user/list";
    }

    @RequestMapping(path = "/userDetail")
    public String getUserById(@RequestParam("id")long id,Model model)
    {
        User u = userService.getUserById(id);
        model.addAttribute("user",u);
        return "user/detail";
    }
}
