package com.service;

import com.model.Blog;
import com.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();

}
