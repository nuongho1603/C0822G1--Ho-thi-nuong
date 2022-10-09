//package ss4.exercise;
//
//import java.util.Scanner;
//
//public class QuadracticEquation2 {
//    int a, b, c;
//
//    public QuadracticEquation2(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    int delta;
//
//    public int getDiscriminant() {
//        return delta = this.b * this.b - 4 * this.a * this.c;
//    }
//
//    int x1, x2;
//
//    public int result() {
//        if (delta >= 0) {
//            return x1 = (int) ((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Moi ban nhap a: ");
//        int a = Integer.parseInt(scanner.nextLine());
//        System.out.print("Moi ban nhap b: ");
//        int b = Integer.parseInt(scanner.nextLine());
//        System.out.print("Moi ban nhap c: ");
//        int c = Integer.parseInt(scanner.nextLine());
//        QuadracticEquation2 quadrac = new QuadracticEquation2(a, b, c);
//        System.out.println("delta = " + quadrac.getDiscriminant());
//    }
//}
