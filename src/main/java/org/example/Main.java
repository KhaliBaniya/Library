package org.example;




import org.example.dto.Student;
import org.example.entity.BookEntity;
import org.example.entity.StudentBookEntity;
import org.example.entity.StudentEntity;
import org.example.enums.StudentRole;
import org.example.repository.StudentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();




  //      ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        AuthController authController = (AuthController) context.getBean("authController");
//        authController.start();
//        InitDatabase initDatabase = (InitDatabase) context.getBean("initDatabase");
//        initDatabase.adminInit();
//        initDatabase.addStudentUser();
//

        //name,surname,phone,created_date,visible,role,password
//        StudentEntity student = new StudentEntity();
//        student.setName("Aziz");
//        student.setSurname("Azizov");
//        student.setPhone("555");
//        student.setVisible(true);
//        student.setCreated_date(LocalDateTime.now());
//        student.setRole("Admin");
//        student.setPassword("555");
//
//        session.save(student);
//        transaction.commit();
//
//        factory.close();
//        session.close();

//        BookEntity book = new BookEntity();
//        book.setTitle("O''tgan kunlar");
//        book.setAuthor("O''tkir Xoshimov");
//        book.setAmount(12);
//        book.setVisible(true);
//
//        session.save(book);
//        transaction.commit();
//
//        factory.close();
//        session.close();


        StudentBookEntity studentBook = new StudentBookEntity();

        studentBook.setStudent_id(1);
        studentBook.setBook_id(1);
        studentBook.setCreated_date(LocalDateTime.now());


        session.save(studentBook);
        transaction.commit();

        factory.close();
        session.close();

    }
}