package ss15_exeption.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
public int[] createRandom(){
    int[] arr = new int[10];
    Random random = new Random();
    System.out.println("Phan tu mang: ");
    for (int i = 0; i <10 ; i++) {
        arr[i] = random.nextInt(10);
        System.out.print(arr[i] + " ");
    }
    return arr;
}
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        int[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
