package ss5.exercise.exercise2;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi nhap ten: ");
        String name = scanner.nextLine();
        Student stu1 = new Student();
        stu1.setName(name);
        stu1.setNameClass("C0822G1");

        System.out.println(stu1.getName());
        System.out.println(stu1.getNameClass());
    }
}
