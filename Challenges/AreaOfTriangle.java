import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Calculating The Area of Triangle\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the Value of Base: ");
        double base = input.nextDouble();
        System.out.println("Now, Enter The Height of The Triangle");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Result is: "+area+"cms2");
    }
}
