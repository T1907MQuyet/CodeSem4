package com.example.springbootonetomanyresapitomemysql.api;

import com.example.springbootonetomanyresapitomemysql.jpa.Book;
import com.example.springbootonetomanyresapitomemysql.jpa.Library;
import com.example.springbootonetomanyresapitomemysql.repository.BookRepository;
import com.example.springbootonetomanyresapitomemysql.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookRepository bookRepository;
    private final LibraryRepository libraryRepository;

    @GetMapping
    public ResponseEntity<Page<Book>> getallBook(Pageable pageable){
        return ResponseEntity.ok(bookRepository.findAll(pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book> getId(@PathVariable Integer id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(optionalBook.get());
    }
    @PostMapping
    public ResponseEntity<Book> create(@Valid @RequestBody Book book){
        Optional<Library> optionalLibrary = libraryRepository.findById(book.getLibrary().getId());
        if (!optionalLibrary.isPresent()){
            return ResponseEntity.unprocessableEntity().build();

        }
        book.setLibrary(optionalLibrary.get());
        Book booksSaved = bookRepository.save(book);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(booksSaved.getId()).toUri();
        return  ResponseEntity.created(location).body(book);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Integer id,@Valid @RequestBody Book book) {
        Optional<Library> optionalLibrary = libraryRepository.findById(book.getLibrary().getId());
        if (!optionalLibrary.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        book.setLibrary(optionalLibrary.get());
        book.setId(optionalBook.get().getId());
        bookRepository.save(book);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer id, @Valid @RequestBody Book book){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (!optionalBook.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }

        bookRepository.delete(optionalBook.get());
        return  ResponseEntity.noContent().build();
    }
}


