package s13.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban kich thuoc cua mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Moi ban nhap phan tu thu" + (i + 1) + " : ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,arr.length-1,5));
    }

    public static int binarySearch(int[] arr, int l, int r, int k) {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (k == arr[mid]) {
                return mid;
            }

            if (k > arr[mid]) {
                return binarySearch(arr, mid + 1, r, k);
            }

            return binarySearch(arr, l, mid - 1, k);
        }

        return -1;
    }
}
