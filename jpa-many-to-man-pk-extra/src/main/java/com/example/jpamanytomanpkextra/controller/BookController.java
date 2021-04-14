package com.example.jpamanytomanpkextra.controller;
import com.example.jpamanytomanpkextra.model.Book;
import com.example.jpamanytomanpkextra.model.Publisher;
import com.example.jpamanytomanpkextra.repository.PuslisherRepository;
import com.example.jpamanytomanpkextra.repository.BookRepository;

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
    private PuslisherRepository puslisherRepository;

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
        List<Publisher> list = puslisherRepository.findAll();
        model.addAttribute("list",list);
        return "listPublisher";
    }
}
