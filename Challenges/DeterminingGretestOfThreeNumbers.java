import java.util.Scanner;

public class DeterminingGretestOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Finding The Greatest Number Among Three...\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Three Numbers Here...");
        Double num1 = input.nextDouble();
        Double num2 = input.nextDouble();
        Double num3 = input.nextDouble();

        if(num1 >= num2 && num1 >= num3) {
            System.out.println("The Greatest Number is: "+num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("The Greatest Number is: "+num2);
        } else {
            System.out.println("The Greatest Number is: "+num3);
        }
    }
}
