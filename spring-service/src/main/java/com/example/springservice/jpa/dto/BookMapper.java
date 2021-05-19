package com.example.springservice.jpa.dto;

import com.example.springservice.jpa.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    BookDto toBookDTO(Book book);
    List<BookDto> toBookDTOs(List<Book> books);
    Book toBook(BookDto bookDto);
}