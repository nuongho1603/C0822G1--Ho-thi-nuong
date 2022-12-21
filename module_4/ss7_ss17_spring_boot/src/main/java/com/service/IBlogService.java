package com.service;

import com.model.MyBlog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
List<MyBlog> findAll();
Optional<MyBlog> findById(int id);
void save(MyBlog blog);
    void deleteById(int id);
}
