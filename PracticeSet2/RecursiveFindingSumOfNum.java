public class RecursiveFindingSumOfNum {
    static int num(int n) {
        if(n==1) {
            return 1;
        }
        return n + num(n-1);
        /*
        let n = 5;
        n + num(n-1)
        num(n-1) = calls the function and the previous number of the n (4)
        5 + 4 + 3 + 2 + 1 = 15
         */
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = num(n);
        System.out.println("The sum of "+ n+" " + "is: " + sum);
    }
}
