package ss3.exercise;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi:");
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        System.out.print("Moi ban nhap mot ky tu:");
        char character = scanner.nextLine().charAt(0);
//        char chs = (char)n;
//        char[] chars = chs.toCharArray() ;
//        String s1 = "Nong Quoc Trung";

        int count = 0;
//        System.out.println("Char Array length: " + ch.length);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < ch.length; i++) {
//            System.out.println(ch[i]);
            if (ch[i] == character) {
                count++;
            }

        }
        System.out.print("Tong so luong ky tu ban nhap: " + count);
    }
}
