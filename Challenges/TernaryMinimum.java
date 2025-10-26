import java.util.Scanner;

public class TernaryMinimum {
    public static void main(String[] args) {
        System.out.println("Finding a minimum of two numbers \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter Your Second Number: ");
        int num2 = input.nextInt();
        TernaryMinimum ternary = new TernaryMinimum();
        int min = ternary.min(num1, num2);
        System.out.println("The Minimum Number is: " + min );

    }

    public int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }
}
