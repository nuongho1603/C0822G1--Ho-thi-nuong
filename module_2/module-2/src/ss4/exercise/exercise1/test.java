package ss4.exercise.exercise1;

import ss4.exercise.exercise1.QuadracticEquation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        QuadracticEquation pt1 = new QuadracticEquation(3,2,1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadracticEquation pt1 = new QuadracticEquation(a, b, c);
//        QuadracticEquation pt2 = new QuadracticEquation(6);
//        System.out.println(pt1.getA());
//        System.out.println(pt1.getB());
//        System.out.println(pt1.getC());

        if (a != 0) {
            if (pt1.getDiscriminant() > 0) {
                System.out.println("DELTA la: " + pt1.getDiscriminant());
                System.out.println("Nghiem thu nhat la: " + pt1.getRoot1());
                System.out.println("Nghiem thu hai la: " + pt1.getRoot2());
            } else if (pt1.getDiscriminant() == 0) {
                System.out.println("Nghiem kep: " + pt1.getRoot1());
            } else {
                System.out.println("Vo nghiem!");
            }


//        pt1.setB(5);
//        System.out.println(pt1.getB());
        } else {
            System.out.println("Khong phai ptb2 nen khong can gia tiep");
        }
    }
}
