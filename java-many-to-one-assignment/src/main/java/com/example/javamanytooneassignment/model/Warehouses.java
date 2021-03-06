package com.example.javamanytooneassignment.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
/*
@Table(name = "warehouses")
*/
public class Warehouses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouse_id;
    private String warehouse_spec;
    private String warehouse_name;
    private String wh_geo_location;

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
    private Locations locations;
    @OneToMany(mappedBy = "warehouses")
    private List<Inventories> inventoriesList;
}
