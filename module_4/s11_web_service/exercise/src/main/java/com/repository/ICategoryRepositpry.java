package com.repository;

import com.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepositpry extends JpaRepository<Category,Integer> {
}
