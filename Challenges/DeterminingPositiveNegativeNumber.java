import java.util.Scanner;

public class DeterminingPositiveNegativeNumber {
    public static void main(String[] args) {
        System.out.println("Determining the Positive And Negative Number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your Number: ");
        int num = input.nextInt();

        if(num < 0) {
            System.out.println("Your Number is Negative");
        } else if(num == 0 ) {
            System.out.println("Your Number is zero");
        } else {
            System.out.println("Your Number is Positive");
        }
    }
}
