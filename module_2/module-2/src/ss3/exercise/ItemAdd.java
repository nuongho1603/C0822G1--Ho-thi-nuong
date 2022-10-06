package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ItemAdd {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so muon chen:");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Ban muon chen vao vi tri nao trong mang:");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 && index > arr.length - 1) {
            System.out.println("KHOng chen dc");
        } else {
            for (int i = arr.length-1; i > index; i--) {
                arr[i] = arr[i-1];

            }  arr[index] = number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
