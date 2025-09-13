import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int inpNum = input.nextInt();
        int sum = calculation(inpNum);
        System.out.println("Odd sum: "+sum);

    }

    public static void greet(){
        System.out.println("Welcome the odd sum counter\n");
    }


    public static int calculation(int num){
       int sum = 0;
       int i = 1;
       while(i <= num){
           sum += i;
           i += 2;

       }
       return sum;
    }
}


