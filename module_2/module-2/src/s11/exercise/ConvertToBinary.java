package s11.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ConvertToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so thap phan: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
//        System.out.println(stack);
    }
}
