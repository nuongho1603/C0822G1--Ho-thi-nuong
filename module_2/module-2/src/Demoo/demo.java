package Demoo;

import java.util.Scanner;

public class demo {
    // Xây dựng lưu đồ và viết chương trình nhập vào một số nguyên n. Tính tổng S = 2+4+6+ 8+ ....+ N(chẵn).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Enter number:");
        do {
            number = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= number; i++) {
                if(i%2 ==0){
                    sum = sum + i;
                }
            }
            System.out.println(sum);
            if (number < 1) {
                System.out.println("Nhap lai!");
            }
        } while (true);
    }
}
