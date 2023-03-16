package org.example.controller;

import org.example.servise.BookService;
import org.example.util.ScannerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {
     @Autowired
    private BookService bookService;

        public void start() {
            boolean b = true;
            while (b) {
                menu();
                int operation = ScannerUtil.getAction();
                switch (operation) {
                    case 1:
                        bookList();
                        break;
                    case 2:
                        addBook();
                        break;
                    case 3:
                        deleteBook();
                        break;
                    case 4:
                        studentList();
                        break;
                    case 5:
                        addStudent();
                        break;
                    case 6:
                        deletestudent();
                        break;
                    case 7:
                        studentTakenBook();
                        break;
                    case 8:
                        bookTakenHistory();
                        break;


                    case 0:
                        b = false;
                        break;
                    default:
                        b = false;
                        System.out.println("Wrong operation number");
                }
            }
        }

    private void bookTakenHistory() {
    }

    private void studentTakenBook() {

    }

    private void deletestudent() {

    }

    private void addStudent() {

    }

    private void studentList() {

    }

    private void deleteBook() {

    }

    private void addBook() {

    }
    //    book list
    private void bookList() {bookService.bookList();}









    public void menu() {
            // book
            System.out.println("1. Book list");
            System.out.println("2. Add book ");
            System.out.println("3. Delete book");
            // student
            System.out.println("4. Student List");
            System.out.println("5. Add Student");
            System.out.println("6. Delete student");
            System.out.println("7. Student Taken book");
            System.out.println("8. BookTaken History");

            System.out.println("0. Log out");
        }


    }
