package com.example.demo2.repository.impl;

import com.example.demo2.model.Book;
import com.example.demo2.repository.BookRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

    Map<Long, Book> books = new HashMap<>();

    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setId(1L);
        book1.setName("White Fang");
        book1.setAuthor("Jack London");
        books.put(book1.getId(), book1);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setName("Programming in java");
        book2.setAuthor("James Gosling");
        books.put(book2.getId(), book2);

        Book book3 = new Book();
        book3.setId(3L);
        book3.setName("Romeo and Julietta");
        book3.setAuthor("Gans Kristian Andersen");
        books.put(book3.getId(), book3);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Book addBook(Book book) {
        return books.put(book.getId(), book);
    }

    @Override
    public Book remove(long id) {
        if (books.containsKey(id)) {
            return books.remove(id);
        } else {
            return null;
        }
    }

    @Override
    public Book update(long id, Book book) {
        return books.put(id, book);
    }

    @Override
    public int getCount() {
        return books.size();
    }
}
