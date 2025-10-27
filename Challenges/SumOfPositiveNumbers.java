public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        System.out.println("This code add all the positive number and skips negative number using Continue \n");
        int[] nums = ArrayUtility.inputArray();
        int result = sum(nums);
        System.out.println("Your total sum of negative number is: "+ result);
    }

    public static int sum(int[] nums) {
        int add = 0;
        for (int num : nums) {
            if (num < 0) {
                continue;
            }
            add += num;
        }
        return add;
    }
}
