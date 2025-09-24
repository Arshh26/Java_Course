import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Searching \n");
        Scanner input = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Please, Enter the Number You Finf in the number: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound) {
            System.out.println("Your Number Found in the Number");
        } else {
            System.out.println("Your Number Not Found in the Number");
        }

    }
    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;




    }
}
