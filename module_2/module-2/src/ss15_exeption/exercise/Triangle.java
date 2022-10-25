package ss15_exeption.exercise;

import org.omg.CORBA.TRANSACTION_MODE;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st triangle side: ");
        int n1, n2, n3;
        while (true) {
            n1 = Integer.parseInt(scanner.nextLine());
            try {
                triangle.checkTriangle(n1);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Enter the 2st triangle side: ");
        while (true) {
            n2 = Integer.parseInt(scanner.nextLine());
            try {
                triangle.checkTriangle(n2);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Enter the 3 st TRIANGLE SIDE : ");
        while (true) {
            n3 = Integer.parseInt(scanner.nextLine());
            try {
                triangle.checkTriangle(n3);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            triangle.checkTriangle(n1, n2, n3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }


    public void checkTriangle(int number1) throws IllegalTriangleException {
        if (number1 <= 0) {
            throw new IllegalTriangleException("Cạnh không được  < 0.Vui lòng nhập lại! ");
        }
    }

    public void checkTriangle(int number1, int number2, int number3) throws IllegalTriangleException {
        if (number1 + number2 <= number3 || number1 + number3 <= number2 || number3 + number2 <= number1) {
            throw new IllegalTriangleException("Không phải 3 cạnh tam giác rùi! ");
        }
        System.out.println("Chắc chắn là 3 cạnh tam giac :) ");
    }
}

