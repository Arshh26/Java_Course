import java.util.Scanner;

public class CategorizingAgeGroups {
    public static void main(String[] args) {
        System.out.println("Categorize Your Age Group..\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your Age: ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("You are a Child");
        } else if (age < 20) {
            System.out.println("You are a Teen");
        } else if (age < 60) {
            System.out.println("You are a Adult");
        } else {
            System.out.println("You are a Senior");
        }
    }
}
