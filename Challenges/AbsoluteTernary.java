import java.util.Scanner;

public class AbsoluteTernary { //Absolute value makes the nagetive value to positive, and positive value keeps positive
    public static void main(String[] args) {
        System.out.println("Welcome for finding absolute vslue \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter your Number: ");
        int num = input.nextInt();
        AbsoluteTernary ternary = new AbsoluteTernary();  //Object is created.
        int result = ternary.absoluteValue(num);
        System.out.println("Your Absolute Value is: "+ result);


    }
    public int absoluteValue(int num){
        return (num >= 0) ? num : -num; // -num is unary Opearator.
    }
}
