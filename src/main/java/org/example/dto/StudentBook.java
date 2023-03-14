package org.example.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentBook {
    /*StudentBook (id,student_id,book_id,createdDate,status(TAKEN,RETURNED),returnedDate,duration)*/
   private Integer id;
   private Integer student_id;
   private Integer book_id;
   private LocalDateTime  createdDate;
   private Date returnedDate ;
   private Date duration;
}
