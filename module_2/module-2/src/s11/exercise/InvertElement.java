package s11.exercise;

import java.util.Scanner;
import java.util.Stack;

public class InvertElement {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        System.out.print(numbers.push(1) + " ");
        System.out.print(numbers.push(2) + " ");
        System.out.print(numbers.push(3) + " ");
        System.out.print("Mang dao nguoc : ");

        System.out.print(numbers.pop() + " ");
        System.out.print(numbers.pop() + " ");
        System.out.println(numbers.pop() + " ");

        Stack<String> stringStack = new Stack<String>();
        System.out.print("Moi ban nhap vao chuoi: ");
        String str = scanner.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            stringStack.push(str.charAt(i) + "");
        }

        System.out.print("-> Chuoi dao nguoc la: ");
        for (int i=0;i<str.length();i++){
            System.out.print(stringStack.pop());
        }
    }


}
