package com.example.javamanytooneassignment.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
/*
@Table(name = "inventories")
*/
public class Inventories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity_on_hand;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product_information product_information;

    @ManyToOne
    @JoinColumn(name = "warehouse_id",referencedColumnName = "warehouse_id")
    private Warehouses warehouses;
}
