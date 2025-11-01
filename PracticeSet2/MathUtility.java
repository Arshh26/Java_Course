public class MathUtility {
    static int add(int a, int b) {
        int sum = a + b;
        System.out.println("Your sum is: "+sum);
        return sum;
    }

    static int square(int a) {
        int sq = a * a;
        System.out.println("Your sum is: "+sq);
        return sq;
    }

    public static void main(String[] args) {
        MathUtility.add(5,5);
        MathUtility.square(5);
    }

}