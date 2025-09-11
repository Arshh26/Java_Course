import java.util.Scanner;

public class BitwiseComplimentOperator {
    public static void main(String[] args) {
        System.out.println("Bitwise Compliment/Not Operator (~)");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter The Number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Result is: "+ result);
    }
}
