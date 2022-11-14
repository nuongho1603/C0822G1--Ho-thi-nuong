package LT;

import java.util.Arrays;
import java.util.Scanner;

public class TT4Everage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhap kich thuoc : ");
            size = Integer.parseInt(scanner.nextLine());

        } while (size > 50);
        int sum = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Array = " + Arrays.toString(arr));

        int count = 0;
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        int average = sum / count;
        System.out.println("Average : " + average);
    }
}
