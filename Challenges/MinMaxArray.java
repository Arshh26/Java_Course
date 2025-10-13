public class MinMaxArray {
    public static void main(String[] args) {
        System.out.println("Finding the  min and max in the array\n");
        int[] numArray = ArrayUtility.inputArray();
        int min = minimum(numArray);
        int max = maximum(numArray);
        System.out.println("Your Minimum Number in the Array is: "+ min);
        System.out.println("Your Maximum Number in the Array is: "+ max);

    }
    public static int minimum(int[] numArray) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length){
            if(min > numArray[i]) {
                min = numArray[i];
            }
            i++;
        }
        return min;
    }

    public static int maximum(int[] numArray) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < numArray.length) {
            if(max < numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
    }

}
