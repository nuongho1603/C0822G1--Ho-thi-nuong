package responsitory.impl;

import model.Product;
import responsitory.IProductReponsitory;

import java.util.ArrayList;
import java.util.List;

public class ProductReponsitory implements IProductReponsitory {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Sách", "Sách vật lí 13", 22.000));
        productList.add(new Product(2, "Sách", "Sách hoas học 13", 22.300));
        productList.add(new Product(3, "Sách", "Sách ngư văn 13", 20.000));
        productList.add(new Product(4, "Truyện tranh", "Doraemon tập 1", 16.500));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, product);
            }
        }
    }
}
