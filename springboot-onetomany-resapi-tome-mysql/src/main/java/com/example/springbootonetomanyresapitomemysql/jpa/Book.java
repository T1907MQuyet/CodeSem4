package com.example.springbootonetomanyresapitomemysql.jpa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @NotNull
    private String name;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "library_id")
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Library library;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
