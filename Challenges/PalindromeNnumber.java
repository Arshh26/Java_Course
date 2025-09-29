import java.util.Scanner;

public class PalindromeNnumber {
    public static void main(String[] args) {
        System.out.println("Palindrome Number\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int num = input.nextInt();
        boolean reverse = reverse(num);
        if(reverse){
            System.out.println("Your Number is Palindrome");
        } else {
            System.out.println("Your Number is not palindrome");
        }
    }

    public static boolean reverse(int num){
        return num == palindromeReverse(num) ;

    }

    public static int palindromeReverse(int num) {
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;

    }
}
