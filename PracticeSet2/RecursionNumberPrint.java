public class RecursionNumberPrint {
    static void number(int n){
        if(n > 5) {
            return;  // base case: stop recursion
        }
        System.out.println(n); // print the number
        number(n+1); // recursive call (calls itself)
    }

    public static void main(String[] args) {
        number(1); // start from 1
    }
}
