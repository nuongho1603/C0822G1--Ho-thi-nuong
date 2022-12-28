package com.repository;

import com.model.BookCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookCodeRepository extends JpaRepository<BookCode,Integer> {
}
