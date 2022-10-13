package ss7.exercise.exercise1;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getAreaSquare());

        square.resize(10);
        System.out.println(square.getAreaSquare());
        square.resize();
        System.out.println(square.getAreaSquare());



    }
}
