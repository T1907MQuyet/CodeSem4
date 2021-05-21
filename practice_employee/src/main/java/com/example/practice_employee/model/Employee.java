package com.example.practice_employee.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "full_name")
    private  String full_name;
    @Column(name = "image")
    private  String image;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "salary")
    private String salary;

    public Employee() {
    }
    public Employee(@NotEmpty(message = "The product name cannot be left blank") String full_name, @NotEmpty(message = "The product description cannot be left blank") String image, Date birthday, String salary) {
        this.full_name = full_name;
        this.image = image;
        this.birthday = birthday;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
