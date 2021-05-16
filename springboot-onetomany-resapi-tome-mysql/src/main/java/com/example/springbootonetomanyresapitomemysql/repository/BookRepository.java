package com.example.springbootonetomanyresapitomemysql.repository;

import com.example.springbootonetomanyresapitomemysql.jpa.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
