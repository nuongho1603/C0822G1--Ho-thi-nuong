package com.reponsitory;

import com.model.Product;

import java.util.List;

public interface IProductReponsitory {
    List<Product> selectAllProduct();

    Product selectById(int id);

    void update(Product product, int id);

    void delete(int id);

    List<Product> searchByName(String name);

}
