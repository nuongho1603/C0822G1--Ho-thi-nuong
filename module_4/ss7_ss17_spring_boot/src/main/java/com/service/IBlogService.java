package com.service;

import com.model.MyBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
List<MyBlog> findAll();
Optional<MyBlog> findById(int id);
void save(MyBlog blog);
    void deleteById(int id);

    Page<MyBlog> findByTitleContaining(String title, Pageable pageable);


}
