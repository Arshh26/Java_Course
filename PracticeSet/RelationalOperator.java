import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to Driving License..");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Age: ");
        int age = input.nextInt();

        if (age>=18) {
            System.out.println("You Are Eligibale For Driving Lisence");
        } else {
            System.out.println("You are Not Eligible for Driving Licensce, Due to Age!!");
        }
    }
}
