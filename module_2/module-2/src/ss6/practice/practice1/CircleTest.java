package ss6.practice.practice1;

import ss7.practice.practice2.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

         circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
    }
}
