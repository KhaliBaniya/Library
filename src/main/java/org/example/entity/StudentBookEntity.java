package org.example.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Student_book")
public class StudentBookEntity {
    /*StudentBook (id,student_id,book_id,createdDate,status(TAKEN,RETURNED),returnedDate,duration)*/
   @Id
   private Integer id;
   @Column(name = "student_id")
   private Integer student_id;
   @Column(name = "book_id")

   private Integer book_id;
   @Column(name = "created_date")

   private LocalDateTime  created_date;
   @Column(name = "returned_date")

   private Date returned_date ;
   private Date duration;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getStudent_id() {
      return student_id;
   }

   public void setStudent_id(Integer student_id) {
      this.student_id = student_id;
   }

   public Integer getBook_id() {
      return book_id;
   }

   public void setBook_id(Integer book_id) {
      this.book_id = book_id;
   }

   public LocalDateTime getCreated_date() {
      return created_date;
   }

   public void setCreated_date(LocalDateTime created_date) {
      this.created_date = created_date;
   }

   public Date getReturned_date() {
      return returned_date;
   }

   public void setReturned_date(Date returned_date) {
      this.returned_date = returned_date;
   }

   public Date getDuration() {
      return duration;
   }

   public void setDuration(Date duration) {
      this.duration = duration;
   }
}
