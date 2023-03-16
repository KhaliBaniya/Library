package org.example.db;

import org.example.dto.Student;
import org.example.enums.StudentRole;
import org.example.repository.BookRepository;
import org.example.repository.StudentRepository;
import org.example.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InitDatabase {
 @Autowired
 private StudentRepository studentRepository;
 @Autowired
 private BookRepository bookRepository;

 public void adminInit(){
     Student student = new Student();
     student.setName("Xumoyun");
     student.setSurname("Eshboyev");
     student.setPhone("123");
     student.setPassword(MD5Util.encode("123"));
     student.setVisible(true);
     student.setRole(StudentRole.ADMIN);

     Student student1 = studentRepository.getStudentByPhone(student.getPhone());
   if (student1 != null){
       return;
   }
   studentRepository.create(student);
 }
 public void addStudentUser(){
//    Student student = new Student();
//    student.setName("Xurshid");
//    student.setSurname("Eshboyev");
//    student.setPhone("1234");
//    student.setPassword("1234");
//    student.setVisible(true);
//    student.setCreated_date(LocalDateTime.now());
//    student.setStudentRole(StudentRole.USER);
//    student.setStatus(GeneralStatus.ACTIVE);
//
//    Student exists = studentRepository.getStudentByPhone(student.getPhone());
//     if (exists != null) {
//         return;
//     }
//     studentRepository.saveStudent(student);

 }

}
