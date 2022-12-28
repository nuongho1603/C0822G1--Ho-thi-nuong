package com.service;

import com.model.Product;
import com.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
   @Autowired
   private IProductRepository iProductRepository;

    @Override
    public Optional<Product> findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }
}
