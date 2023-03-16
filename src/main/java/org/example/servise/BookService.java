package org.example.servise;

import org.example.dto.Book;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public void bookList() {
        List<Book> bookList = bookRepository.getList();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
