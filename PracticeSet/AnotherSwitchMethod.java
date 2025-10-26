import java.util.Scanner;

public class AnotherSwitchMethod {
    public static void main(String[] args) {
        System.out.println("This is a another method to write a switch statement \n ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your day: ");
        int day = input.nextInt();

        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday, Holiday";
            case 7 -> "Sunday, Holiday";
            default -> "Invalid Day";
        };
        System.out.println(dayStr);
    }
}
