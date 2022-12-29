package com.service;

import com.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    Optional<Blog> findById(int id);
    void save(Blog blog);
    void remove(int id);
    List<Blog> findBlogByCategory(int id);
//    Page<Blog> findByTitleContaining(String title, Pageable pageable);

}
