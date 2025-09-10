import java.util.Scanner;

public class FloatingNumbersProduct {
    public static void main(String[] args) {
        System.out.println("Calculating the Floating Numbers Products\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your First Floating Value: ");
        double num1 = input.nextDouble();
        System.out.print("Now, Enter Your Second Floating Value: ");
        double num2 = input.nextDouble();

        System.out.println(num1*num2);
    }
}
