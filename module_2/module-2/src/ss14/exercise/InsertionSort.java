package ss14.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] arr = {-1, 5, 2, 7, -22, 95, 16, 11, 199, 12};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        }
    }


