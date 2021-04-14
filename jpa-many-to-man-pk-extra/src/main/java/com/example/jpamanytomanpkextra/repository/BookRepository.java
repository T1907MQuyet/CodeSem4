package com.example.jpamanytomanpkextra.repository;

import com.example.jpamanytomanpkextra.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
