package org.example.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
public class BookEntity {
    /*Book (id,title,author, publishYear, amount, visible)   (amount - shu kitobdan nechta borligi)*/
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)

     private Integer id;
     private String title;
     private String author;
     @Column(name = "publish_year")
     private Date publishYear;
     private Integer amount;
     private Boolean visible;

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public Date getPublishYear() {
  return publishYear;
 }

 public void setPublishYear(Date publishYear) {
  this.publishYear = publishYear;
 }

 public Integer getAmount() {
  return amount;
 }

 public void setAmount(Integer amount) {
  this.amount = amount;
 }

 public Boolean getVisible() {
  return visible;
 }

 public void setVisible(Boolean visible) {
  this.visible = visible;
 }
}
