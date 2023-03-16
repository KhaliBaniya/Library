package org.example.controller;


import org.example.servise.BookService;
import org.example.util.ScannerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
@Autowired
    private BookService bookService;

/**/

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
                    takeBook();
                    break;
                case 3:
                    takenBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    history();
                    break;
                case 6:
                    orderBook();
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

    private void orderBook() {
        /* Order book (qandaydir kitob bo'lmasa kutubhonachida
         shu  kitobni olib kelinglar deb yozish mumkun.)
         Enter book name: */
    }

    private void history() {
        /*
5. History (Shu studentni barcha olgan  topshirgan yoki hali topshirmagan kitoblar ro'yhati)
  Studentni olib qaytargan yoki olib hali qaytarmagan kitoblar tarixi.
  Konsolga quyidagilar chiqsin
    OrderNumber   BookTitle   BookAuthor   Status  TakenDate (kitobni olgan vaqti)    returnedDate
*/
    }

    private void returnBook() {
    /*  Enter book id:*/
    }

    private void takenBook() {
        /*Taken book (Olib lekin qaytarmagan kitoblar)
        Studentni olib hali qaytarmagan kitoblari. Konsolga quyidagilar chiqsin
        OrderNumber  BookTitle  BookAuthor TakenTime (kitobni olgan vaqti)*/
    }

    private void takeBook() {
  /*
  2. Take book (kitob olish)
  Enter book Id
  (bitta student bir vaqtni o'zida 5ta kitob olishi mumkun.
  Ya'ni studentning olgan hali qaytarmagan kitoblar soni 5ga teng bo'lsa unga boshqa kitob berilmaydi.)   Agar kitob qolmagan bo'lsa berilmasin.
   */


    }

    private void bookList() {
        //1. Book bist (kitoblar)
        //  OrderNumber  BookTitle  BookAuthor
    }


    public void menu() {
        System.out.println("1. Book list   ");
        System.out.println("2. Take book   ");
        System.out.println("3. Taken book  ");
        System.out.println("4. Return book ");
        System.out.println("5. History     ");
        System.out.println("6. Order book  ");
        System.out.println("7. Make Payment");
        System.out.println("0. Log out     ");
    }

}
