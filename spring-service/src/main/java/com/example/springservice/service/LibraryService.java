package com.example.springservice.service;

import com.example.springservice.jpa.Library;

import java.util.List;

public interface LibraryService {
    List<Library> listLibrary();
    Library getLibraryById(int library_id);
    boolean saveLibrary(Library library);
    boolean deleteLibrary(int library_id);
    boolean updateLibrary(Library library);
}