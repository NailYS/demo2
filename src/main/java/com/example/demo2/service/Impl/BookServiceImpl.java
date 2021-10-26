package com.example.demo2.service.Impl;

import com.example.demo2.model.Book;
import com.example.demo2.repository.BookRepository;
import com.example.demo2.repository.impl.BookRepositoryImpl;
import com.example.demo2.service.BookService;

import javax.print.DocFlavor;
import java.util.List;

public class BookServiceImpl implements BookService {
    BookRepository bookRepository = new BookRepositoryImpl();

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    @Override
    public Book remove(long id) {
        return bookRepository.remove(id);
    }

    @Override
    public Book update(long id, Book book) {
        return bookRepository.update(id, book);
    }

    @Override
    public int getCount() {
        return bookRepository.getCount();
    }
}
