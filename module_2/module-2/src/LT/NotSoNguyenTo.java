package LT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NotSoNguyenTo {
    //1. Viết 1 hàm nhận vào 1 số nguyên bất kì. Hiển thị các số nguyên tố từ 0 đến số đấy.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        int dem =0;
        int num;
            System.out.print("Nhap so nguyen bat ky: ");
            number = sc.nextLine();
            String primeNumbers = "";
        for (int i = 0; i <= Integer.parseInt(number); i++) {
            int counter = 0;
            for (num = i; num > 0; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
                dem++;
            }
        }

       System.out.println("Các số nguyên tố từ  0 đến " + number + ": ");
        System.out.println(Arrays.toString(primeNumbers.split(" ")));
        System.out.println(dem);
    }
}
