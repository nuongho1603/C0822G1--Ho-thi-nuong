package ss1_introdustion.exercise.codegym;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int vnd = 23000;
//        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD: ");
       double usd = Double.parseDouble(scanner.nextLine());
        double quydoi = usd * vnd;
        System.out.println("Gia tri VND" +quydoi);
    }
}

