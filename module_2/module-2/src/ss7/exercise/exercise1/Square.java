package ss7.exercise.exercise1;

public class Square extends Shape implements Resizeable {
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
    public void resize(double persent) {
        this.edge += this.edge*persent/100;
    }

    @Override
    public void resize() {
        this.edge += this.edge*Math.random();
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
}
