import java.util.Scanner;

public class ForEachMaxArrInt {
    public static void main(String[] args) {
        System.out.println("Welcome for finding Max number  in the array using for each \n");
        Scanner input = new Scanner(System.in);
         int[] arr = ArrayUtility.inputArray();

         int max = Integer.MIN_VALUE;
         for(int num : arr) {
             if(max < num) {
                 max = num;
             }
        }
        System.out.println("Your Maximum number is: "+ max);
    }
}
