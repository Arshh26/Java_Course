import java.util.Scanner;

public class DeletingElementArray {
    public static void main(String[] args) {
        System.out.println("Deleting Specific Element from an Element\n");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now, Enter the Number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deletedNum(numArr, numToDelete);
        System.out.println("Here is your new Array: "+ newArr);
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deletedNum(int[] numArray, int numToDelete) {
        int occ = OccurrencesArray.occurrences(numArray, numToDelete);
        if (occ == 0) {
            return numArray;
        }
        int newSize = numArray.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArray.length) {
            if (numArray[i] != numToDelete) {
                newArr[j] = numArray[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}


