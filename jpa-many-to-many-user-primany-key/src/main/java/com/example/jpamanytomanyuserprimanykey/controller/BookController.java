package com.example.jpamanytomanyuserprimanykey.controller;
import com.example.jpamanytomanyuserprimanykey.model.Book;
import com.example.jpamanytomanyuserprimanykey.model.Publisher;
import com.example.jpamanytomanyuserprimanykey.repository.BookRepository;
import com.example.jpamanytomanyuserprimanykey.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PublishRepository publisherRepository;

    @RequestMapping(path = "")
    public String getListBook(Model model)
    {
        List<Book> list = bookRepository.findAll();
        model.addAttribute("list",list);
        return "listBook";
    }

    @RequestMapping(path = "/publisher")
    public String getPublisher(Model model)
    {
        List<Publisher> list = publisherRepository.findAll();
        model.addAttribute("list",list);
        return "listPublisher";
    }
}
