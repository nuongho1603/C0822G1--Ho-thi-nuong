package s12.exercise;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

import java.util.*;

public class ProductManager extends Product {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();
    Product products1 = new Product(1, "Sach", 19000);
    Product products2 = new Product(2, " But", 16000);
    Product products3 = new Product(3, "Vo", 55000);

    {
        productArrayList.add(products1);
        productArrayList.add(products2);
        productArrayList.add(products3);
    }


    public void display() {
        for (Product product : productArrayList) {
            System.out.println(product.toString());
        }
    }

    public void add() {
        Product product = new Product();
        System.out.print("Moi ban nhap id");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.print("Moi ban nhap san pham: ");
        product.setNameProduct(scanner.nextLine());
        System.out.print("Moi ban nhap gia san pham: ");
        product.setPrice(Double.parseDouble(scanner.nextLine()));

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
                item.setPrice(Double.parseDouble(scanner.nextLine()));
                display();
            }
        }
    }

    public void sort() {

//          Collections.sort(productArrayList,new Comparato());
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (Product product : productArrayList) {
            System.out.println(product.toString());
        }
//        Collections.sort(productArrayList, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return -(int) (o1.getPrice() - o2.getPrice());
//            }
//        });
//        for (Product product : productArrayList) {
//            System.out.println(product.toString());
//        }
   }

}


