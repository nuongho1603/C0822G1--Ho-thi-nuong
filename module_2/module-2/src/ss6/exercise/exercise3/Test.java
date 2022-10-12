package ss6.exercise.exercise3;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(5,3);
        MovablePoint movablePoint = new MovablePoint(5,6,5,5);
        System.out.println(point.toString());
        System.out.println(movablePoint.toString());

        movablePoint.move();
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
