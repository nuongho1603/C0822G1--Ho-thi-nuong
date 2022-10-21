package s13.practice;

import java.security.PublicKey;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        int[] frequencyChar = new int[255];                         //{1}
        for (int i = 0; i < string.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) string.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequencyChar[ascii] += 1;                              //{4}
        }

        int max = 0;                                             //{5}N
        char character = (char) 255; /* empty character */      //{6}
        for (int i = 0; i < 255; i++) {                         //{7}
            if (frequencyChar[i] > max) {                        //{8}
                max = frequencyChar[i];                          //{9}
                character = (char) i;                           //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
