public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average\n");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("The total sum of an array is: "+sum);
        System.out.println("The total average of sum is: "+average);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average (int[] numArray){
        double sum = sum(numArray);
        double total =  (sum / numArray.length);
        return total;
    }
}
