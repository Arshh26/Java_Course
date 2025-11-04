package MyPackage.Array.Abstract;

public class SquareTwo extends ShapeTwo {
    private double side;

    public SquareTwo(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
