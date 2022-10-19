package s11.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class MapOfExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap chuoi: ");
        String str = scanner.nextLine();
        String[] word = str.split(" ");
        int sum = 0;

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : word) {
            if (map.containsKey(s)) {
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            } else {
                sum++;
            }
        }
        System.out.println("Tong so tu co trong chuoi la: " + sum);
    }


}
