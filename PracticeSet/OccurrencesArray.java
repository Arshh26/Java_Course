import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        int[] arr = array();
        Scanner input = new Scanner(System.in);
        System.out.println("Now, Enter the number you want to find: ");
        int num = input.nextInt();
        int occ = occurrences(arr, num);
        System.out.println("Your Number was found " + occ + " times in the array");
    }

    public static int[] array() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the number of elements: ");
        int size = input.nextInt();
        int[] num = new int[size];

        int i = 0;
        while (i < num.length) {
            System.out.println("Now, Enter the element number " + (i + 1) + ": ");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }

    public static int occurrences(int[] numArray, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
