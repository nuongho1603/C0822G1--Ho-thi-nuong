package ss3.exercise;

import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        int m;
        do {
            System.out.print("Nhap vao hang: ");
            m = Integer.parseInt(scanner.nextLine());
            if (m <= 0) {
                System.out.print("Ủa lo, số lượng hàng phải >0 bạn nhé" +
                        " bạn nhập lại nhanh dùm đi, mình cọc mình quánh chech cha bạn giờ:)");
            }
        } while (m <= 0);
        int[][] arr = new int[m][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhap vao a[" + i + "][" + j + "]:");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++) {
                if(arr[i]== arr[j]){
                    sum += arr[i][j];

                }

            }
        }
        System.out.print("Tong casc phan tu nam tren duong cheo chin h= " +sum);
    }
}
