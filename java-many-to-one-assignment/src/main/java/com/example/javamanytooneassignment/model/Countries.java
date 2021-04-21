package com.example.javamanytooneassignment.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
/*@Table(name = "countries")*/
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int country_id;
    private String country_name;

    @ManyToOne
    @JoinColumn(name = "region_id",referencedColumnName = "region_id")
    private Regions region;

    @OneToMany(mappedBy = "countries")
    private List<Countries> countries;
}
