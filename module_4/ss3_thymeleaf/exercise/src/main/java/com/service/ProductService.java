package com.service;

import com.model.Product;
import com.reponsitory.IProductReponsitory;
import com.reponsitory.ProductReponsitory;

import java.util.List;

public class ProductService implements IProductService {
    IProductReponsitory productReponsitory = new ProductReponsitory();

    @Override
    public List<Product> selectAllProduct() {
        return productReponsitory.selectAllProduct();
    }

    @Override
    public Product selectById(int id) {
        return productReponsitory.selectById(id);
    }

    @Override
    public void update(Product product, int id) {
        productReponsitory.update(product, id);
    }

    @Override
    public Product delete(int id) {
        productReponsitory.delete(id);
        return null;
    }

    @Override
    public List<Product> searchByName(String name) {
        return productReponsitory.searchByName(name);
    }


}
