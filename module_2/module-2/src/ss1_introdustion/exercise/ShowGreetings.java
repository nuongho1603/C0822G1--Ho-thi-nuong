package ss1_introdustion.exercise;

import java.util.Scanner;

public class ShowGreetings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, " +name);
    }
}
