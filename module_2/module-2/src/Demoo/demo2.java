package Demoo;

import java.util.Scanner;

public class demo2 {
    // Xây dựng lưu đồ và viết chương trình nhập vào một số nguyên n. Tính tổng S= -1+2-3+4-5+.......N
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int s = 0;
        int sum;
        int sum1 = 0;
        int sum2;
        System.out.println("Enter number:");
        do {
            number = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= number; i += 2) {
                s = s + i;
            }
            sum = -s;
            for (int i = 2; i <= number; i += 2) {
                sum1 = sum1 + i;
            }
            sum2 = sum1 + sum;
            System.out.println("Ket qua: " + sum2);
        } while (number < 1);
    }
}
