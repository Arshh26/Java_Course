public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2Dimensional Array: ");
        int[][] arr = {{2, 5, 6}, {2, 8, 5}, {3, 6, 9}};
//        System.out.println(arr.length);

//Traversal
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
