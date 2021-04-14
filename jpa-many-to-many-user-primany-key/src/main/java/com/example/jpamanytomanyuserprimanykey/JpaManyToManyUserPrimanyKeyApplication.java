package com.example.jpamanytomanyuserprimanykey;

import com.example.jpamanytomanyuserprimanykey.model.Book;
import com.example.jpamanytomanyuserprimanykey.model.BookPublisher;
import com.example.jpamanytomanyuserprimanykey.model.Publisher;
import com.example.jpamanytomanyuserprimanykey.repository.BookPublisherRepository;
import com.example.jpamanytomanyuserprimanykey.repository.BookRepository;
import com.example.jpamanytomanyuserprimanykey.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JpaManyToManyUserPrimanyKeyApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookPublisherRepository bookPublisherRepository;
    @Autowired
    PublishRepository publishRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaManyToManyUserPrimanyKeyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Spring Boot");
        bookRepository.saveAll(Arrays.asList(book1));

        Publisher publisher1 = new Publisher(("Fpt aptech"));
        publishRepository.saveAll(Arrays.asList(publisher1));

        BookPublisher bookPublisher1 = new BookPublisher(book1,publisher1,new Date());
        bookPublisherRepository.saveAll(Arrays.asList(bookPublisher1));

    }
}
