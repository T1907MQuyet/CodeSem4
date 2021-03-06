package com.example.javamanytooneassignment.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
/*
@Table(name = "product_descriptions")
*/
public class Product_descriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int language_id;
    private String translated_name;
    private String translated_description;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product_information product_information;

}
