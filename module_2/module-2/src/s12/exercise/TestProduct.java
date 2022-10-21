package s12.exercise;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        do {
            System.out.println("------CHOICE------\n" +
                    "1.Display products\n " +
                    "2.Add product\n" +
                    "3.Edit product\n" +
                    "4.Delete product\n" +
                    "5.Sort product\n" +
                    "6.Exit");
            System.out.print("Choice of you : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.add();
                    break;
                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.deleteProduct();
                    break;
                case 5:
                    productManager.sort();
                    break;
                case 7:

                case 6:
                    System.exit(1);
                    break;
            }

        }
        while (true);
    }
}
