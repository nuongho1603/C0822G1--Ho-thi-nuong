package com.service.impl;

import com.model.BookCode;
import com.repository.IBookCodeRepository;
import com.repository.IBookRepository;
import com.service.IBookCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookCodeService implements IBookCodeService {
    @Autowired
    private IBookCodeRepository iBookCodeRepository;
    @Override
    public Iterable<BookCode> findAll() {
        return iBookCodeRepository.findAll();
    }

    @Override
    public Optional<BookCode> findById(int id) {
        return iBookCodeRepository.findById(id);
    }

    @Override
    public void save(BookCode bookCode) {
iBookCodeRepository.save(bookCode);
    }

    @Override
    public void remove(int id) {
iBookCodeRepository.deleteById(id);
    }
}
