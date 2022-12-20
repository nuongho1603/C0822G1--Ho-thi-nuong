package com.service;

import com.modal.Product;
import com.reponsitory.IProductReponsitory;
import com.reponsitory.ProductReponsitory;

import java.util.List;

public class ProductService implements IProductService {
    IProductReponsitory iProductReponsitory = new ProductReponsitory();

    @Override
    public List<Product> selectAllProduct() {
        return iProductReponsitory.selectAllProduct();
    }

    @Override
    public Product selectById(int id) {
        return iProductReponsitory.selectById(id);
    }

    @Override
    public void update(Product product) {
        iProductReponsitory.update(product);
    }

    @Override
    public List<Product> searchByName(String name) {
        return iProductReponsitory.searchByName(name);
    }

    @Override
    public void addProduct(Product product) {
        iProductReponsitory.update(product);
    }

    @Override
    public void delete(int id) {
        iProductReponsitory.delete(id);
    }
}
