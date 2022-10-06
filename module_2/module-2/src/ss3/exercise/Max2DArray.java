package ss3.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 2}, {5, 2, 8}, {1, 1, 2}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        } System.out.println(max);
    }
}
