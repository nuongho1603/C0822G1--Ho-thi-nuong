package com.service;

import com.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> selectAllProduct();

    Product selectById(int id);

    void update(Product product, int id);

    Product delete(int id);

    List<Product> searchByName(String name);

}
