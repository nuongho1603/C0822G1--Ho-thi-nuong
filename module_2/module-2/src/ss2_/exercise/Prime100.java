package ss2_.exercise;

import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("MOi ban so luong : ");
//        int number = Integer.parseInt(scanner.nextLine());
        int browser = 0;
        int n = 2;
        String str = "";
        while (n < 100) {
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