package responsitory;

import model.Product;

import java.util.List;

public interface IProductReponsitory {
    List<Product> findAll();
    Product findById(int id);
    void add(Product product);
    void delete(int id);

    void update(int id, Product product);
}
