package ss6.exercise.exercise1;

import  ss6.exercise.exercise1.Circle;
import ss6.exercise.exercise1.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(2,"black");
        Cylinder cylinder=new Cylinder(5,"red",5);
        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolume());
    }
}
