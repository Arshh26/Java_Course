import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to Ternary Operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.println("Now, Enter Your Second Number: ");
        int num2 = input.nextInt();

        int greaterNumber = (num1 > num2) ? num1 : num2;
        System.out.println(greaterNumber + " is a greatest value");
    }
}
