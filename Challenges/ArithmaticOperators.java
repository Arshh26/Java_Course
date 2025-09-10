import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter The Second Number: ");
        int num2 = input.nextInt();

        System.out.println("Calculation in Process...");
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

        System.out.println("Done");

    }
}
