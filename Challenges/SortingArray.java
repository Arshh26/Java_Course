public class SortingArray {
    public static void main(String[] args) {
        System.out.println("Sorting the Array\n");
        int[] numArray = ArrayUtility.inputArray();
        boolean isDec = isDecreasing(numArray);
        boolean isInc = isIncreasing(numArray);
        if(isDec || isInc) {
            System.out.println("Your Array is Sorted");
        } else {
            System.out.println("Your Array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] numArray){
        int i = 1;
        while(i < numArray.length) {
            if(numArray[i] > numArray[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArray) {
        int i = 1;
        while(i < numArray.length) {
            if(numArray[i] < numArray[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
