import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to student score \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int marks = input.nextInt();
        String category = (marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low"));
        System.out.println("Your Score is: "+ category);

    }
}
