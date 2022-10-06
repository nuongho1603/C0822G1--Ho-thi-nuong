package ss2_.exercise;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MOi ban nhap so luong : ");
        int number = Integer.parseInt(scanner.nextLine());
        int browser = 0;
        int n = 2;
        String str = "";
        while (browser < number) {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                str = str + n + " ";
                browser++;
            } n++;
        }
        System.out.println(str);
    }
}
