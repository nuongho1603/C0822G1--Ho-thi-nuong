package com.service.impl;

import com.model.Category;
import com.repository.ICategoryRepositpry;
import com.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepositpry iCategoryRepositpry;
    @Override
    public List<Category> findAll() {
        return iCategoryRepositpry.findAll();
    }

//    @Override
//    public Optional<Category> findById(int id) {
//        return iCategoryRepositpry.findById(id);
//    }
}
