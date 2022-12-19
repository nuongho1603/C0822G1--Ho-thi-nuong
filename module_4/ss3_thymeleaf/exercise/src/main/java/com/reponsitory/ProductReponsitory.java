package com.reponsitory;

import com.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductReponsitory implements IProductReponsitory {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Sach Vat Li 12", 12.000, "sách dành cho học sinh 12", "NSX: Hồ Thị Nương"));
        productList.add(new Product(2, "Sach BT Li 12", 13.000, "sách bài tập 12", "NSX: Tân Thuận Tiến"));
        productList.add(new Product(3, "Sach Ngữ Văn 12", 10.000, "sách dành cho học sinh 12", "NSX: Tân Thuận Tiến"));
        productList.add(new Product(4, "Sach Toán 12", 12.500, "sách dành cho học sinh 12", "NSX: Tân Thuận Tiến"));
    }

    @Override
    public List<Product> selectAllProduct() {
        return productList;
    }

    @Override
    public Product selectById(int id) {
        for (Product p : productList
        ) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(Product product, int id) {
        Product product1 = selectById(id);
        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        product1.setContent(product.getContent());
        product1.setProducer(product.getProducer());
    }

    @Override
    public void delete(int id) {
        for (Product p : productList
        ) {
            if (p.getId() == id) {
                productList.remove(p);
            }
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product p : productList
        ) {
            if (p.getName().contains(name)) {
                products.add(p);
            }
        }
        return products;
    }
}
