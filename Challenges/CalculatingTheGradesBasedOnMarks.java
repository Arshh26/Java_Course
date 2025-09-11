import java.util.Scanner;

public class CalculatingTheGradesBasedOnMarks {
    public static void main(String[] args) {
        System.out.println("Get Your Result Here...\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter your Marks you Scored: ");
        int marks = input.nextInt();

        if (marks >= 90){
            System.out.println("Congratulations!!, You Got a A grade");
        } else if (marks >= 75) {
            System.out.println("Very Good!!, You Got a B Grade");
        } else if (marks >= 60) {
            System.out.println("You Got a C grade");
        } else if (marks >= 30) {
            System.out.println("D grade");
        } else {
            System.out.println("Year Back");
        }
    }
}
