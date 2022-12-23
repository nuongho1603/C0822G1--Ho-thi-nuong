package com.service.impl;

import com.model.MyBlog;
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

    public List<MyBlog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<MyBlog> findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(MyBlog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void deleteById(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<MyBlog> findByTitleContaining(String title, Pageable pageable) {
        return iBlogRepository.findByTitleContaining(title,pageable);
    }



}
