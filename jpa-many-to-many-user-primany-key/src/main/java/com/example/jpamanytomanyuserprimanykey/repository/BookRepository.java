package com.example.jpamanytomanyuserprimanykey.repository;

import com.example.jpamanytomanyuserprimanykey.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book ,Integer> {
}
