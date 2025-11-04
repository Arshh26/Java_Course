package MyPackage.Array.Abstract;

public class CircleTwo extends ShapeTwo{
    private final double radiusInCm;

    public CircleTwo(double radiusInCm){
        this.radiusInCm = radiusInCm;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCm, 2);
    }
}
