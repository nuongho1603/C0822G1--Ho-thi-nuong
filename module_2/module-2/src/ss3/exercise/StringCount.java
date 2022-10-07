package ss3.exercise;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
//        String str = "Nong Quoc Trung";
//        char[] character = str.toCharArray();
//        int leng = character.length;
//        char[] character;
//        System.out.print("Moi ban nhap mot ky tu:");
//        String a = scanner.nextLine();
//        int count = 0;
//        for (int i = 0; i < leng; i++) {
//            if( a == character) {
//                char character = str.charAt(a);
//            }
//            str.indexOf(a);

//            System.out.print(character[i]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap mot ky tu:");
//        int n=Integer.parseInt(scanner.nextLine());
        char n = scanner.nextLine().charAt(0);
//        char chs = (char)n;
//        char[] chars = chs.toCharArray() ;
        String s1 = "Nong Quoc Trung";
        char[] ch = s1.toCharArray();
        int count=0;
//        System.out.println("Char Array length: " + ch.length);
        System.out.println("Char Array elements: ");
        for (int i = 0; i < ch.length; i++) {
//            System.out.println(ch[i]);
            if(ch[i] == n){
                count++;
            }

        }
        System.out.print("Tong so luong ky tu ban nhap: " +count);
    }
}
