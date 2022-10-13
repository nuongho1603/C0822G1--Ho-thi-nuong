package ss7.exercise.exercise2;

public class Square extends Shape implements Colorable{
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getAreaSquare() {
        return edge * edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
