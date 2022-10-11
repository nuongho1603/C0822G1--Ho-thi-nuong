package ss6.exercise.exercise1;

import  ss6.exercise.exercise1.Circle;
import ss6.exercise.exercise1.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(4,"black");
        Cylinder cylinder=new Cylinder(2,"red",3);
        System.out.println(circle.getArea());
        System.out.println(cylinder.volume());
    }
}
