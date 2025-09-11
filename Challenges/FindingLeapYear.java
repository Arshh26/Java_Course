import java.util.Scanner;

public class FindingLeapYear {
    public static void main(String[] args) {
        System.out.println("finding Leap Year..");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year != 100) || year % 400 == 0) {
            System.out.println("Your Year is Leap Year");
        } else {
            System.out.println("Your Year is Not a leap year");
        }
    }
}
