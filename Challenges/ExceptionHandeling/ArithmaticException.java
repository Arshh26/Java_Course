package ExceptionHandeling;

import java.util.Scanner;

public class ArithmaticException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter your two numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        calc(num1, num2);
    }

    public static void calc(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Not Divisible by Zero");
        } finally {
            System.out.println("Program Continues...");
        }
    }
}




