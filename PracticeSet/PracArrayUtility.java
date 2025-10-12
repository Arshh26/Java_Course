import java.util.Scanner;

public class PracArrayUtility {
    public static int[] pracInputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while(i < nums.length){
            System.out.println("Enter your element " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
