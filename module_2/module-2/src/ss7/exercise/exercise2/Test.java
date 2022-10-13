package ss7.exercise.exercise2;

public class Test {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(1);
        squares[1] = new Square(2.0);
        squares[2] = new Square(6.0);
//        squares[3] = new SquareColorable(5);
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Area square " + i + " is: " + squares[i].getAreaSquare());

            if (squares[i] instanceof Colorable) {
                squares[i].howToColor();
            }
        }
    }
}
