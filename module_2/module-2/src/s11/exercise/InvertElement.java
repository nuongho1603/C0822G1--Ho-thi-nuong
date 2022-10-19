package s11.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InvertElement {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        System.out.print("Nhap kich thuoc mang: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Moi ban nhap phan tu thu " + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            numbers.push(array[i]);
        }
        System.out.println(Arrays.toString(array));

        System.out.print("Mang so dc dao nguoc: ");
        for (int i = 0; i < size; i++) {
            array[i] = numbers.pop();
        }

        System.out.println(Arrays.toString(array));

//        System.out.print(numbers.push(1) + " ");
//        System.out.print(numbers.push(2) + " ");
//        System.out.print(numbers.push(3) + " ");
//        System.out.print("- Mang dao nguoc : ");
//
//        System.out.print(numbers.pop() + " ");
//        System.out.print(numbers.pop() + " ");
//        System.out.println(numbers.pop() + " ");
//
        Stack<String> stringStack = new Stack<String>();
        System.out.println("Moi ban nhap vao chuoi: ");
        String str = scanner.nextLine();
        String[] strings = str.split("");

        for (int i = 0; i < strings.length; i++) {
            stringStack.push(strings[i]);
        }

        System.out.println("CHUOI DA DUOC DAO NGUOC: ");
        for (int i = 0; i < stringStack.size(); i++) {
            System.out.print(stringStack.pop() + "");
            i--;
        }
    }
}
