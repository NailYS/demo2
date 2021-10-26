package com.example.demo2.repository;

import com.example.demo2.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBooks();

    Book addBook(Book book);

    Book remove(long id);

    Book update(long id, Book book);

    int getCount();
}
