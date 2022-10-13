package ss7.exercise.exercise1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
//        System.out.println(circle);
        System.out.println(circle.getArea());
        circle.resize(10);
        System.out.println(circle.getArea());
        circle.resize();
        System.out.println(circle.getArea());


//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
    }
}
