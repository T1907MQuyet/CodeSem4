package com.example.springservice.service;

import com.example.springservice.jpa.Book;

import java.util.List;

public interface BookService {
    List<Book> listBook();
    Book getBookById(int book_id);
    boolean saveBook(Book book);
    boolean deleteBook(int book_id);
    boolean updateBook(Book book);
}
