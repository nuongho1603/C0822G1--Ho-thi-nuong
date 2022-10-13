package ss7.exercise.exercise1;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        rectangle.resize(5);
        System.out.println(rectangle.getArea());
        rectangle.resize();
        System.out.println(rectangle.getArea());



//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
    }
}