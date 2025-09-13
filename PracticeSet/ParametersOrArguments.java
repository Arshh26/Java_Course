import java.util.Scanner;

public class ParametersOrArguments {
    public static void main(String[] args) {
        int sumOfTwoNumbers = adding(5,5);
        System.out.println(sumOfTwoNumbers);

    }

    public static int adding(int first, int second){
        System.out.println("First number received: "+first);
        System.out.println("second number received: "+second);
        int sum = first + second;
        return sum;
    }
}
