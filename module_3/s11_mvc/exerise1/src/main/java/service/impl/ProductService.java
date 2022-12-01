package service.impl;

import model.Product;
import responsitory.IProductReponsitory;
import responsitory.impl.ProductReponsitory;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
IProductReponsitory productReponsitory = new ProductReponsitory();
    @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void add(Product product) {
productReponsitory.add(product);
    }

    @Override
    public void delete(int id) {
        productReponsitory.delete(id);
    }


    @Override
    public void update(int id, Product product) {
        productReponsitory.update(id,product);
    }
}
