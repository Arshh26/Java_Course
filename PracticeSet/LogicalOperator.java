import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to Driving License..");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Age: ");
        int age = input.nextInt();

        if (age>=18 && age <= 50 ) {
            System.out.println("You Are Eligible for Driving Licence");
        } else if (age >= 51){
            System.out.println("Your Life Matters, Licence is not Applicable for this age");
        } else {
            System.out.println("Drive a Bicycle");
        }
    }
}
