package com.example.springbootonetomanyresapitomemysql.service;

import com.example.springbootonetomanyresapitomemysql.jpa.Book;
import com.example.springbootonetomanyresapitomemysql.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private  final BookRepository bookRepository;
    public List<Book> fillAllBook(){
        return bookRepository.findAll();
    }

    public Book saveProduct(Book product){
        return  bookRepository.save(product);
    }
    public Optional<Book> finById(Integer id){
        return  bookRepository.findById(id);
    }
    public void  deleteProductById(int id){
        bookRepository.deleteById(id);
    }
}
