package pk;

import java.util.Arrays;
import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Nhập phần tử vị trí thứ " +(i+1)+": ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
    }
}
