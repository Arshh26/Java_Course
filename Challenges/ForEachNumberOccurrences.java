import java.util.Scanner;

public class ForEachNumberOccurrences {
    public static void main(String[] args) {
        System.out.println("Number of Occurrences");
        Scanner input = new Scanner(System.in);
        int[] nums = ArrayUtility.inputArray();
        System.out.println("Enter your number, you to find");
        int element = input.nextInt();
        int occ = occurrences(nums, element);
        System.out.println("Your Number is occurred " + occ + " times");
        }

        public static int occurrences(int[] nums, int element) {
            int occ = 0;
            for (int num : nums) {
                if (num == element) {
                    occ++;
                }
            }
            return occ;
        }
}
