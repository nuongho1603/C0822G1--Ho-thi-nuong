package ss17.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

    static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void writeFile() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("module-2\\src\\ss17\\exercise\\Data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(productList);
            oos.close();
            fos.close();
        } finally {

        }
    }

    public static void menuProduct() throws IOException {
        int choice;

        do {
            System.out.println("1.Add product." +
                    "2.Display product." +
                    "3.Search product." +
                    "4.Exit.");
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    writeFile();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.exit(0);

            }

        } while (true);
    }

    private static void searchProduct() {
        System.out.println("Enter ID product? : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getMaSanPham() == id) {
                System.out.println(productList.get(i));
            }
            System.out.println("Khong tim thay thoong tin cua ban! ");
        }

    }

    private static void display() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public static Product addProduct() {

        System.out.println("ID: ");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        System.out.print("NAme: ");
        String tenSanPham = scanner.nextLine();
        System.out.print("Hang sn xuat: ");
        String hangSX = scanner.nextLine();
        System.out.print("GIa: ");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.print("Cacs mo ta khac: ");
        String cacMoTaKhac = scanner.nextLine();
        Product product = new Product(maSanPham, tenSanPham, hangSX, gia, cacMoTaKhac);
        productList.add(product);
        return product;
    }

    public static void main(String[] args) throws IOException {
        ProductMain productMain = new ProductMain();
        productMain.menuProduct();
    }

}
