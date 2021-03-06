package com.example.javamanytooneassignment.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
/*
@Table(name = "locations")
*/
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int location_id;
    private String street_address;
    private String postal_code;
    private String state_province;


    @ManyToOne
    @JoinColumn(name = "country_id",referencedColumnName = "country_id")
    private Countries countries;

    @OneToMany(mappedBy = "locations")
    private List<Departments> departmentsList;

    @OneToMany(mappedBy = "locations")
    private List<Warehouses> warehousesList;
}
