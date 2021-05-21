package com.example.practice_employee.controller;

import com.example.practice_employee.model.Employee;
import com.example.practice_employee.service.EmployeeService;
import com.example.practice_employee.validator.EmployeeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {
    public static final String uploadingDir = System.getProperty("user.dir")+"/uploadingDir/";
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeValidator employeeValidator;

    @RequestMapping(value = "")
    public String listProduct(Model model)
    {
        List<Employee> list = employeeService.getAllEmployee();
        model.addAttribute("list",list);
        return "employee/listEmp";
    }
    @RequestMapping(value = "/create")
    public String insertPro(Model model)
    {
        Employee pro = new Employee();
        model.addAttribute("pro",pro);
        return "employee/insertPro";
    }

    @RequestMapping(value = "/saveEmp",method = RequestMethod.POST)
    public String savePro(@ModelAttribute("emp")Employee emp, @RequestParam("uploadingfile") MultipartFile uploadFiles, BindingResult result, Model model)throws IOException
    {
        Random random = new Random();
        int randomWithNextInt = random.nextInt();
        employeeValidator.validate(emp,result);
        if(result.hasErrors())
        {
            model.addAttribute("pro",emp);
            return "employee/insertEmp";
        }
        else{
            File file = new File(uploadingDir+randomWithNextInt+uploadFiles.getOriginalFilename());
            uploadFiles.transferTo(file);
            emp.setImage("/uploadingDir/"+randomWithNextInt+uploadFiles.getOriginalFilename());
            employeeService.insertEmp(emp);
            return "redirect:/employee?success";
        }
    }

    @RequestMapping(value = "/edit")
    public String editPro(@RequestParam("id")Integer id,Model model)
    {
        Employee employee = employeeService.getEmpById(id);
        model.addAttribute("emp",employee);
        return "employee/editEmp";
    }

    @RequestMapping(value = "/updatePro",method = RequestMethod.POST)
    public String updatePro(@ModelAttribute("pro")Employee emp,Model model,@RequestParam("uploadingfile")MultipartFile uploadFiles)throws IOException
    {
        Random random = new Random();
        int randomWithNextInt = random.nextInt();
        String filename = uploadFiles.getOriginalFilename();

        if(!filename.isEmpty())
        {
            File file = new File(uploadingDir+randomWithNextInt+uploadFiles.getOriginalFilename());
            uploadFiles.transferTo(file);

            emp.setImage("/uploadingDir/"+randomWithNextInt+uploadFiles.getOriginalFilename());
        }else{
            Employee p = employeeService.getEmpById(emp.getId());
            emp.setImage(p.getImage());
        }


        boolean p = employeeService.updateEmp(emp);
        if (p)
        {
            return "redirect:/product?success";
        }else{
            model.addAttribute("pro",emp);
            return "employee/editEmp?error";

        }

    }

    @RequestMapping(value = "/deleteEmp")
    public String deletePro(@RequestParam("id")Integer id,Model model)
    {
        boolean b = employeeService.deleteEmp(id);
        if (b)
        {
            return "redirect:/employee?success";
        }else
        {
            return "redirect:/employee?error";
        }
    }



}
