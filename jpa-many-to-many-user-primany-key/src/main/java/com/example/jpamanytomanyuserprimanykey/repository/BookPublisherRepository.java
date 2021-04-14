package com.example.jpamanytomanyuserprimanykey.repository;

import com.example.jpamanytomanyuserprimanykey.model.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository<BookPublisher,Integer> {
}
