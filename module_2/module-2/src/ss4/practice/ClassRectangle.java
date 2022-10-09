package ss4.practice;

import java.awt.*;
import java.util.Scanner;

public class ClassRectangle {
    double width, height;

//    public ClassRectangle() {
//    }

    public ClassRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Hinh chu nhat{" + "chieu rong" + width + ", chieu dai" + height + "}";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap chieu rong hcn:");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Moi ban nhap chieu dai hcn:");
        double height = Double.parseDouble(scanner.nextLine());
        ClassRectangle rectangle = new ClassRectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("chu vi hcn = " + rectangle.getPerimeter());
        System.out.println("Dien tich hcn= " + rectangle.getArea());
    }
}

