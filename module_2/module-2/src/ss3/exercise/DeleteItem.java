package ss3.exercise;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteItem {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 1, 1, 0};
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Check number: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;


                for (int j = index; j < arr.length-1; j++) {

                    arr[j] = arr[j + 1];
                }
                i--;
            }
        }


        System.out.println("Vi tri cua so ban vua nhap la:" + index);
        arr[arr.length-1]=0;
        System.out.println("Sau khi xoa phan tu mang la: "+ Arrays.toString(arr));
//        for (int i=0; i<size ;i++) {
//            System.out.printf("\narr[%d] = %d" ,i,arr[i]);
//
//        }

    }

}
