package com.example.jpamanytomanpkextra.repository;

import com.example.jpamanytomanpkextra.model.Book;
import com.example.jpamanytomanpkextra.model.BookPublisher;
import com.example.jpamanytomanpkextra.model.BookPublisherId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublishRepository extends JpaRepository<BookPublisher, BookPublisherId> {

}
