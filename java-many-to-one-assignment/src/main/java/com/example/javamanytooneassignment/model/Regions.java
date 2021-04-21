package com.example.javamanytooneassignment.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
/*
@Table(name = "regions")
*/
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int region_id;
    private String region_name;

    @OneToMany(mappedBy = "region")
    private List<Countries> listCountries;
}
