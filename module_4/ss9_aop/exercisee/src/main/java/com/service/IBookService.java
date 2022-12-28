package com.service;

import com.model.Book;

import java.util.Optional;

public interface IBookService {

    Iterable<Book> findAll();

    Optional<Book> findById(int id);

    void save(Book book);

    void remove(int id);
}
