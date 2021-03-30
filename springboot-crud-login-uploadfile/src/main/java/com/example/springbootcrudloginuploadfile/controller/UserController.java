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
    @RequestMapping("list")
    public  String list(ModelMap model ,@PathVariable(name = "username") String username){

        /*model.addAttribute("USERs",userService.findAll());*/
        Optional<User> u = userService.findById(username);
        if (u.isPresent()){
            model.addAttribute("USER",u.get());
        }else {
            model.addAttribute("USER",new User());
        }
        return "view-user";
    }
    @RequestMapping("/delete/{username}")
    /*public String delete(ModelMap model,@PathVariable(name = "username")String username){
        userService.delete(username);
    }*/

}
