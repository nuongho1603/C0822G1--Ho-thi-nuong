package ss4.exercise.exercise1;

public class QuadracticEquation {
    private double a;
    private double b;
    private double c;

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadracticEquation(double b) {
        this.b = b;
    }

//    public double getA() {
//        return a;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public double getB() {
//        return b;
//    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public double getRoot1() {
        double root1 = 0;
        if (this.getDiscriminant() >= 0) {
            root1 = (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        }
        return root1;
    }

    public double getRoot2() {
        double root2 = 0;
        if (this.getDiscriminant() >= 0) {
            root2 = (-this.b - Math.sqrt(this.getDiscriminant()))/ (2 * this.a);
        }
        return root2;
    }

//    public double getRoot3() {
//        double root3 = 0;
//        if (this.getDiscriminant() == 0) {
//            root3 = (-this.b / (2 * this.a));
//        }
//        return root3;
//    }
}
