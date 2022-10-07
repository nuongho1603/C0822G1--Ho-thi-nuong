package ss3.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column;
        do {
            System.out.print("Mời bạn nhập vị trí côt muốn tính tổng: ");
            column = Integer.parseInt(scanner.nextLine());
            if (column < 0) {
                System.out.println("Vui lòng nhập đúng dùm cái. ");
            }
        } while (column < 0);

        int sum = 0;
        int m;
        do {
            System.out.print("Nhap vao hang: ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.print("Ủa alo, số lượng hàng phải >0 bạn nhé" +
                        " bạn nhập lại nhanh dùm đi, mình cọc mình quánh chech cha bạn giờ:)");
            }
        } while (m <= 0);

        int n;
        do {
            System.out.print("Nhap vao cot: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.print("Vui lòng nhập lại giúp mình số cột: ");
            }
        } while (n < 0);

        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap vao a[" + i + "][" + j + "]:");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
//        for(int i=0;i<arr.length ;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }


        if (column < n) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][column];
            }
            System.out.print(sum);
        } else {
            System.out.print("Cot ban muon tinh khong nen lon hon so luong cot co san!");
        }
    }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(column == arr[i][j]) {
//                    sum += arr[i][j];
//                }
//            }


}
