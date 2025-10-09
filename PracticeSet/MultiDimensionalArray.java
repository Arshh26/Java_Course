public class MultiDimensionalArray {
    public static void main(String[] args) {
        System.out.println("2D Array\n");

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(arr[0][1]);

//        int[][] myArr = new int[2][4];

        int i = 0;
        while(i < arr.length){
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
