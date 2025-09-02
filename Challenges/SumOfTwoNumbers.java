package Challenges;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter Your Second Number: ");
        int num2 = input.nextInt();
        int sumNum = num1 + num2;
        System.out.println("Your Sum of Two Number is: "+ sumNum );
    }
}
