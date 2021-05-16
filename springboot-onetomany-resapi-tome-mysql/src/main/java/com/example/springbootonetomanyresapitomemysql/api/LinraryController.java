package com.example.springbootonetomanyresapitomemysql.api;

import com.example.springbootonetomanyresapitomemysql.jpa.Library;
import com.example.springbootonetomanyresapitomemysql.repository.BookRepository;
import com.example.springbootonetomanyresapitomemysql.repository.LibraryRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/libraryes")
public class LinraryController {
    private final LibraryRepository libraryRepository;
    private final BookRepository bookRepository;
    //Phan trang
    @GetMapping
    public ResponseEntity<Page<Library>> getAll(Pageable pageable){
        return  ResponseEntity.ok(libraryRepository.findAll(pageable));
    }
    @GetMapping("/{id}")
    public  ResponseEntity<Library> getByid(@PathVariable Integer id){
        Optional<Library> optionalLibrary = libraryRepository.findById(id);
        if (!optionalLibrary.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        return  ResponseEntity.ok(optionalLibrary.get());


    }
    @PostMapping
    public ResponseEntity<Library> createLibraty(@Valid @RequestBody Library library){
        Library librarySaved = libraryRepository.save(library);
        // checl header of service
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(librarySaved.getId()).toUri();
        return ResponseEntity.created(location).body(librarySaved);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Library> updateLibrary(@PathVariable Integer id, @Valid @RequestBody Library library){
        Optional<Library> optionalLibrary = libraryRepository.findById(id);
        if (!optionalLibrary.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        library.setId(optionalLibrary.get().getId());
        libraryRepository.save(library);
        return  ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Library> deleteLibrary(@PathVariable Integer id, @Valid @RequestBody Library library){
        Optional<Library> optionalLibrary = libraryRepository.findById(id);
        if (!optionalLibrary.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }

        libraryRepository.delete(optionalLibrary.get());
        return  ResponseEntity.noContent().build();
    }
}
