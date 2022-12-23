package com.service.impl;

import com.model.Category;
import com.repository.ICategoryRepository;
import com.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
   private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

//    @Override
//    public void save(Category category) {
//        iCategoryRepository.save(category);
//    }
}
