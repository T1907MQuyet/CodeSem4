package com.example.springbootcrudloginuploadfile.controller;

import com.example.springbootcrudloginuploadfile.model.User;
import com.example.springbootcrudloginuploadfile.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    User _userBean;

    @GetMapping("/")
    public String addOrEdit(ModelMap model){
        User u = new User();
        model.addAttribute("USER",u);
        model.addAttribute("ACTION","saveOrUpdate");
        return "register-user";
    }
    @PostMapping("/saveOrUpdate")
    public  String savveOrUpdate(ModelMap model, @ModelAttribute("USER") User user){
        userService.save(user);
        return  "register-user";
    }
    @RequestMapping("/list")
    public  String list(ModelMap model ){

        model.addAttribute("USERS",userService.findAll());
        /*Optional<User> u = userService.findById(username);
        if (u.isPresent()){
            model.addAttribute("USERS",u.get());
        }else {
            model.addAttribute("USERS",new User());
        }*/
        return "view-user";
    }
    @RequestMapping("/edit/{username}")
            public  String edit(ModelMap model ,@PathVariable(name = "username") String username)
    {
        Optional<User> u = userService.findById(username);
         if (u.isPresent()){
            model.addAttribute("USER",u.get());
        }else {
            model.addAttribute("USER",new User());
        }
        model.addAttribute("ACTION","/saveOrUpdate");
        return "register-user";
    }
    @RequestMapping("/login")
    public  String showLogin(){
        return "login";
    }
    @PostMapping("checklogin")
    public String checkLogin(@RequestParam("username")String username,
                             @RequestParam("password") String password){
        if (_userBean.getUsername().equals(username)&& _userBean.getPassword().equals(password)){
            System.out.println("Login thanh cong");
            return "view-user";
        }else {
            System.out.println("Login fail");
        }
        return "login";
    }
    @GetMapping("logout")
    public String logout(){
        return "login";
    }




}
