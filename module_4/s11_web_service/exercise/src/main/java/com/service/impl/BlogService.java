package com.service.impl;

import com.model.Blog;
import com.repository.IBlogRepository;
import com.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public List<Blog> findBlogByCategory(int id) {
        return iBlogRepository.findBlogByCategory(id);
    }

    @Override
    public Optional<Blog> findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        iBlogRepository.deleteById(id);
    }


//    @Override
//    public Page<Blog> findByTitleContaining(String title, Pageable pageable) {
//        return iBlogRepository.findByTitleContaining(title,pageable);
//    }
}
