public class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sorted Array Checkpost\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isDec = isDecreasing(numArr);
        boolean isInc = isIncreasing(numArr);
        if (isDec || isInc) {
            System.out.println("Your Array is Sorted");
        } else {
            System.out.println("Your Array is not Sorted");
        }

    }
    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if(numArr[i] < numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
