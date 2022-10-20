package s12.exercise;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ProductManager extends Product {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();
    Product products1 = new Product(1, "Sach", 16000);
    Product products2 = new Product(2, " But", 16000);
    Product products3 = new Product(3, "Vo", 55000);
  //  private Product Collection;

    {
        productArrayList.add(products1);
        productArrayList.add(products2);
        productArrayList.add(products3);
    }


    public void display() {

        System.out.println(productArrayList);
    }

    public void add() {
        Product product = new Product();
        System.out.print("Moi ban nhap id");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.print("Moi ban nhap san pham: ");
        product.setNameProduct(scanner.nextLine());
        System.out.print("Moi ban nhap gia san pham: ");
        product.setPrice(Integer.parseInt(scanner.nextLine()));

        productArrayList.add(product);
        display();
    }

    public void deleteProduct() {
        System.out.print("Nhap san pham muon xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product item : productArrayList) {
            if (item.getId() == id) {
                productArrayList.remove(item);
                display();
            }
        }
    }

    public void edit() {
        System.out.print("Ban muon sua san pham co id = ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product item : productArrayList) {
            if (item.getId() == id) {
                System.out.print("Moi ban nhap lai id: ");
                item.setId(Integer.parseInt(scanner.nextLine()));
                System.out.print("Moi ban nhap lai ten san pham: ");
                item.setNameProduct(scanner.nextLine());
                System.out.print("Moi ban nhap lai gia");
                item.setPrice(Integer.parseInt(scanner.nextLine()));
                display();
            }
        }
    }

//    public void sortPrice() {
//    }
}
