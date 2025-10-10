import java.util.Scanner;

public class NumberOccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number Occurrences in the Array:\n ");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now, Enter Your Number you want to find in the Array: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr, num);
        System.out.println("Your Number was found " + occurrences + " time in the array");
    }

    public static int noOfOccurrences(int[] numArray, int num){
        int occ = 0;
        int i  = 0;
        while(i < numArray.length){
            if(numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
