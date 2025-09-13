import java.util.Scanner;

public class CommentsAndWhileLoop {
    public static void main(String[] args) {
        System.out.println("Comments and While Loops\n");
        int num = 1; //Initialization
        while (num <= 10){ //Condition
            System.out.println(num); //Actual Work
            num += 1; // Updating The Condition
        }

        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count -= 1;
        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.print("Enter Your Number: ");
            int inp = input.nextInt();
            System.out.println("Number is: "+inp);
            i ++;
        }
    }
}
