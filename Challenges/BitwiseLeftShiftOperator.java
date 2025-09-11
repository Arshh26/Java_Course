import java.util.Scanner;

public class BitwiseLeftShiftOperator {
    public static void main(String[] args) {
        System.out.println("Bitwise Leftshift Operator..\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("Result is: "+ result);


    }
}
