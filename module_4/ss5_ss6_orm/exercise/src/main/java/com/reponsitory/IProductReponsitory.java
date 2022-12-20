package com.reponsitory;

import com.modal.Product;

import java.util.List;

public interface IProductReponsitory {
    List<Product> selectAllProduct();
    Product selectById(int id);
    void update(Product product);
    List<Product> searchByName(String name);
    void addProduct(Product product);
    void delete(int id);
}
