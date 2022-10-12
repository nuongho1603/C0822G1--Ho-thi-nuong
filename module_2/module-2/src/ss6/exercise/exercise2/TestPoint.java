package ss6.exercise.exercise2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        Point3D point3D = new Point3D(2,4,3);

        System.out.println(point2D);
        System.out.println(point3D);

        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
