package com.example.jpamanytomanpkextra.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;

    @OneToMany(mappedBy = "book",
            cascade = CascadeType.ALL)
    private Set<BookPublisher> bookPublisher = new HashSet<>();

    public Book(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
