package LT;

import java.util.Arrays;
import java.util.Scanner;

public class TT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu vi tri thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Array before= " + Arrays.toString(arr));
        System.out.print("Nhap number: ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] % 2 != 0) {
                    arr[i]++;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr[i]++;
                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
         if (num == arr[i]){
             arr[i] = -1;
         }
        }

        System.out.println("Array after: " + Arrays.toString(arr));
    }
}
