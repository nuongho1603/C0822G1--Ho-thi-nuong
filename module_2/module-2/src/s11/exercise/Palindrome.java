package s11.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        String[] characters = str.split("");

        for(String string : characters){
            stringStack.push(string.toLowerCase());
            stringQueue.add(string.toLowerCase());
        }

        if(stringStack.pop().equals(stringQueue.remove())){
            System.out.println("đó là chuỗi Palindrome");
        }else {
            System.out.println("đó khong là chuỗi Palindrome!");
        }

    }
}
