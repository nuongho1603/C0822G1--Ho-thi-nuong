package ss5.exercise.exercise1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     public double getRadius() {
        return radius;
    }

   public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + ",which is a subclass of "
               ;
    }
}
