package com.service;

import com.model.BookCode;

import java.util.Optional;

public interface IBookCodeService {
    Iterable<BookCode> findAll();

    Optional<BookCode> findById(int id);

    void save(BookCode bookCode);

    void remove(int id);
}
