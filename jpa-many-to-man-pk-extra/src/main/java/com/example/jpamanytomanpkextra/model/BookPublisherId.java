package com.example.jpamanytomanpkextra.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class BookPublisherId implements Serializable {
    @Column(name = "book-_id")
    private  Integer bookId;
    @Column(name = "publisher_id")
    private  Integer publisherId;


}
