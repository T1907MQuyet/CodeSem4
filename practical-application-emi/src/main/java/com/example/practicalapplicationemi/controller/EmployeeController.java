package com.example.practicalapplicationemi.controller;

import com.example.practicalapplicationemi.model.Customer;
import com.example.practicalapplicationemi.model.Employee;
import com.example.practicalapplicationemi.repository.CustomerRepository;
import com.example.practicalapplicationemi.service.CustomerService;
import com.example.practicalapplicationemi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "employee")
public class EmployeeController {
    @Autowired
    private EmployeeService emiService;

    @Autowired
    private CustomerRepository customerRepository;

    @InitBinder
    public void InitBinder(WebDataBinder data)
    {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        data.registerCustomEditor(Date.class, new CustomDateEditor(s, true));
    }

    @RequestMapping(path = "")
    public String insertEmi(Model model)
    {
        Employee emi = new Employee();
        List<Customer> listCust = customerRepository.findAll();
        model.addAttribute("emiNew",emi);
        model.addAttribute("listCust",listCust);
        return "insertEmi";
    }
    @RequestMapping(path = "saveEmi",method = RequestMethod.POST)
    public String saveEmi(@ModelAttribute("emiNew")Employee emi)
    {
        boolean bl = emiService.saveEmi(emi);
        if (bl)
        {
            return "redirect:/emi?success=insert success";
        }
        return "redirect:/emi?error=insert failed";
    }


}
