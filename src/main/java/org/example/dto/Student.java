package org.example.dto;

import lombok.*;
import org.example.enums.StudentRole;


import java.time.LocalDateTime;




public class Student {
    /* Student (id, name, surname,phone, createdDate, visible) */
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private Boolean visible;
    private LocalDateTime created_date;
    private StudentRole role;
   // private GeneralStatus status;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date) {
        this.created_date = created_date;
    }

    public StudentRole getRole() {
        return role;
    }

    public void setRole(StudentRole role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", visible=" + visible +
                ", created_date=" + created_date +
                ", role=" + role +
                ", password='" + password + '\'' +
                '}';
    }
}
