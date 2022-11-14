package LT;

import java.util.*;

public class ThuatToan2 {
    public static void main(String[] args) {
//        String regex = "\\d";
//        String regex1 ="[0-9]";
        Scanner scanner = new Scanner(System.in);


        System.out.print("Kich thuoc mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu vi tri thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(countNumber(arr));
    }

    public static TreeMap<Integer, Integer> countNumber(int[] arr) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int key : arr) {
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                int count = treeMap.get(key);
                treeMap.put(key, count + 1);
            }
        }
        return treeMap;
    }


}
