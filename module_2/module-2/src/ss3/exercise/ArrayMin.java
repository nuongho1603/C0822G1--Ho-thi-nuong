package ss3.exercise;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap kich thuoc mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Moi ban nhap phan tu thu " + (i+1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for( int i=0;i< arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}
