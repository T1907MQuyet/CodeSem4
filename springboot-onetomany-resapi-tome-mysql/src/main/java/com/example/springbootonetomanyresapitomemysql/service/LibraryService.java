package com.example.springbootonetomanyresapitomemysql.service;

import com.example.springbootonetomanyresapitomemysql.jpa.Book;
import com.example.springbootonetomanyresapitomemysql.jpa.Library;
import com.example.springbootonetomanyresapitomemysql.repository.BookRepository;
import com.example.springbootonetomanyresapitomemysql.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LibraryService {
    private  final LibraryRepository libraryRepository;
    public List<Library> fillAllLibrary(){
        return libraryRepository.findAll();
    }

    public Library saveProduct(Library library){
        return  libraryRepository.save(library);
    }
    public Optional<Library> finById(Integer id){
        return  libraryRepository.findById(id);
    }
    public void  deleteProductById(int id){
        libraryRepository.deleteById(id);
    }

}
