package org.example.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    /*Book (id,title,author, publishYear, amount, visible)   (amount - shu kitobdan nechta borligi)*/
     private Integer id;
     private String title;
     private String author;
     private Date publishYear;
     private Integer amount;
     private Boolean visible;
}
