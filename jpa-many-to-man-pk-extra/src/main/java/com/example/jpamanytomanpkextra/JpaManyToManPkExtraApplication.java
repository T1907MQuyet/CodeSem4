package com.example.jpamanytomanpkextra;

import com.example.jpamanytomanpkextra.model.Book;
import com.example.jpamanytomanpkextra.model.BookPublisher;
import com.example.jpamanytomanpkextra.model.Publisher;
import com.example.jpamanytomanpkextra.repository.BookPublishRepository;
import com.example.jpamanytomanpkextra.repository.BookRepository;
import com.example.jpamanytomanpkextra.repository.PuslisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import javax.xml.xpath.XPathVariableResolver;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JpaManyToManPkExtraApplication implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PuslisherRepository puslisherRepository;
    @Autowired
    private BookPublishRepository bookPublishRepository;


    public static void main(String[] args) {
        SpringApplication.run(JpaManyToManPkExtraApplication.class, args);
    }
    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Book b1 = new Book("Java Spring Boot");
        Book b2 = new Book(" Rest Spring Boot");
        bookRepository.saveAll(Arrays.asList(b1,b2));

        Publisher p1 = new Publisher("NXB Fpt Aptech");
        Publisher p2 = new Publisher("NXB TG");
        puslisherRepository.saveAll(Arrays.asList(p1,p2));

        BookPublisher bp1 = new BookPublisher(b1,p1,new Date());
        BookPublisher bp2 = new BookPublisher(b2,p2,new Date());
        bookPublishRepository.saveAll(Arrays.asList(bp1,bp2));


    }


}
