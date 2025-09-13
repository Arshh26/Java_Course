public class PatternsUsingMethods {
    public static void main(String[] args) {
//        rightHalfPyramid();
        reverseHalfPyramid();
//        leftHalfPyramid();

    }

    public static void rightHalfPyramid() {
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *\n");

        int rows = 0;
        while(rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void reverseHalfPyramid() {
//        System.out.println("* * * * *");
//        System.out.println("* * * *");
//        System.out.println("* * *");
//        System.out.println("* *");
//        System.out.println("*\n");

//        int rows = 0;
//        while(rows < 5) {
//            System.out.print("*");
//            int i = 0;
//            while( i < 5){
//                System.out.print(" *");
//                i--;
//            }
//            System.out.println();
//            rows++;
//        }
    }

    public static void leftHalfPyramid() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *\n");
    }
}
