import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        greet();
        int num1 = firstNumber();
        int num2 = secondNumber();

        int sum = num1 + num2;
        System.out.println("Result is: "+sum);
    }

    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }

    public static int firstNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter The Number: ");
        int number = input.nextInt();
        return number;
    }

    public static int secondNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Now, Enter The Second Number: ");
        int number = input.nextInt();
        return number;
    }
}
