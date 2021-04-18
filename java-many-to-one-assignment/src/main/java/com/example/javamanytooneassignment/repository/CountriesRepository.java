package com.example.javamanytooneassignment.repository;

import com.example.javamanytooneassignment.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries,Integer> {
}
