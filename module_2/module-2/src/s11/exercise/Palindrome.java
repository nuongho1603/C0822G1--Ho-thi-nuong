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
        String str = scanner.nextLine().toLowerCase();
        String[] characters = str.split("");

        for (String string : characters) {
            stringStack.push(string);
            stringQueue.add(string);
        }
        boolean check = true;
        for (int i = 0; i < stringStack.size(); i++) {
            if (!stringStack.pop().equals(stringQueue.remove())) {
                check = false;
                break;
            }
        }
        if(check == true){
            System.out.println("la chuoi Palindrome.");
        } else {
            System.out.println("kh phai.");
        }

    }
}
