
package ss7.practice.practice2;

import ss6.practice.practice1.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public  Circle(double v){
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double getArea() {
        return  radius*radius* Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + ",which is a subclass of ";
    }
}