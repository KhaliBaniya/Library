package org.example.servise;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.controller.AdminController;
import org.example.controller.StudentController;
import org.example.dto.Student;
import org.example.enums.StudentRole;
import org.example.repository.StudentRepository;
import org.example.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AuthService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AdminController adminController;
    @Autowired
    private StudentController studentController;


    public void login(String phone, String password) {
        Student student =  studentRepository.getStudentByPhoneAndPassword(phone, MD5Util.encode(password));

        if (student == null) {
            System.out.println("Phone or Password incorrect");
            return;
        }

//        if (!student.getStatus().equals(GeneralStatus.ACTIVE)) {
//            System.out.println("You not allowed.MF");
//            return;
//        }


        if (student.getRole().equals(StudentRole.ADMIN)) {
            adminController.start();
        } else if (student.getRole().equals(StudentRole.USER)) {
            studentController.start();
        } else {
            System.out.println("You don't have any role.");
        }

    }

}
