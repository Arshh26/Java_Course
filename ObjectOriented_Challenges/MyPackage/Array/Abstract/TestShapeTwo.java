package MyPackage.Array.Abstract;

public class TestShapeTwo {
    public static void main(String[] args) {
        CircleTwo c2 = new CircleTwo(5);
        SquareTwo s2 = new SquareTwo(10.3);

        System.out.printf("Area of circle is %f: ", c2.calculateArea());
        System.out.printf("Area of Square is %f: ", s2.calculateArea());

    }
}
