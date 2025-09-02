import java.util.Scanner;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of A: ");
        int a = input.nextInt();
        System.out.println("Enter The Number of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Value of A is: "+ a);
        System.out.println("Value of B is: "+ b);
    }
}
