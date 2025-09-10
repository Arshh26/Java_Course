import java.util.Scanner;

public class PerimeterOfRectangular {
    public static void main(String[] args) {
        System.out.println("Calculating The Perimeter of Rectangular\n");
        System.out.println("Please, Enter All 4 Sides in cms");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Value of A: ");
        float numA = input.nextFloat();
        System.out.println("Enter The Value of B: ");
        float numB = input.nextFloat();
        System.out.println("Enter The Value of C: ");
        float numC = input.nextFloat();
        System.out.println("Enter The Value of D: ");
        float numD = input.nextFloat();

        double sum = numA + numB + numC + numD;
        System.out.println("Result is: "+ sum+"cm");


    }
}
