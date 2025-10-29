import java.util.Scanner;

public class Circle {
    double radiusInMM;

    Circle(double radiusInMM) {
        this.radiusInMM = radiusInMM;
    }

    double getCircumference(){
        return 2 * radiusInMM * Math.PI;

    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMM, 2);
    }


    @Override
    public String toString() {
        return "Circle crops: Radius in mm: " + radiusInMM +
                ", circumference in mm: " + getCircumference() +
                ", Area in mm2: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter your radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);

    }
}
