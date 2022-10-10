package ss4.exercise.excercise2;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    //    public Fan(int speed, boolean on, String color, double radius) {
//        this.speed = speed;
//        this.on = on;
//        this.color = color;
//        this.radius = radius;
//    }

    public String toString() {
        if (this.on) {
            return ("speed: " + this.speed + ", Trang thai: " + this.on + ", color: " + this.color + ", radius: " + this.radius + ", fan is on ");
        } else {
            return ("speed: " + this.speed + ", Trang thai: " + this.on + ", color: " + this.color + ", radius: " + this.radius + ", fan is off ");
        }
    }
}



