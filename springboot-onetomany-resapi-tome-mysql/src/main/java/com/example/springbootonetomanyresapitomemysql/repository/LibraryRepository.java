package com.example.springbootonetomanyresapitomemysql.repository;

import com.example.springbootonetomanyresapitomemysql.jpa.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library,Integer> {
}
