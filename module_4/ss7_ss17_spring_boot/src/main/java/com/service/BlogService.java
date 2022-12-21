package com.service;

import com.model.MyBlog;
import com.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


}
