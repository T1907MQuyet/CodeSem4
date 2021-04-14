package com.example.jpamanytomanpkextra.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Book_publisher")
public class BookPublisher {
    @EmbeddedId
    private BookPublisherId id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private  Book book;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @MapsId("publisherId")
     @JoinColumn(name ="publisher_id")
    private  Publisher publisher;
    private Date publisherDate;

    public BookPublisher(Book book,Publisher publisher,Date publisherDate) {
        this.id = new BookPublisherId(book.getId(),publisher.getId());
        this.book = book;
        this.publisher = publisher;
        this.publisherDate  = publisherDate;
    }
}
