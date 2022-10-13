package ss7.exercise.exercise1;

import ss7.exercise.exercise2.Colorable;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
//        System.out.println(shape);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(4);

        System.out.println("Dien tich ban dau cua hinh tron: " +((Circle) shapes[0]).getArea());
        ((Circle) shapes[0]).resize();
        System.out.println("Dien tich sau cua hinh tron: " +((Circle) shapes[0]).getArea() + "\n");

        System.out.println("Dien tich ban dau cua hcn: "+((Rectangle) shapes[1]).getArea());
        ((Rectangle) shapes[1]).resize(5);
        System.out.println("Dien tich sau cua hcn: " +((Rectangle) shapes[1]).getArea() + "\n");

        System.out.println("Dien tich ban dau cua hinh vuong: " +((Square) shapes[2]).getAreaSquare());
        ((Square) shapes[2]).resize(5);
        System.out.println("Dien tich sau cua hinh vuong: " + ((Square) shapes[2]).getAreaSquare() + "\n");




//        System.out.println(shapes[0]);
//        for (int i = 0; i < shapes.length; i++) {
////            System.out.println("Area square " + i + " is: " + shapes[i].);
//            () shapes[i].resize();
//            System.out.println(shapes.getAreaSquare());

//            if (squares[i] instanceof Colorable) {
//                squares[i].howToColor();
//            }


    }
}
