import java.util.Scanner;

public class GcdFinder {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your First Number: ");
        int first= input.nextInt();
        System.out.println("Now, Enter Your Second Number: ");
        int second= input.nextInt();
        int gcd = gcd(first, second);
        System.out.println("Your GCD is: "+ gcd);

    }

    public static void greet() {
        System.out.println("GCD Finder\n");

    }

    public static int gcd(int first, int second){
        int gcd = 1;
        int i = 2;
        int  least = least(first, second);
        while(i <= least) {
            if (first % i == 0 && second % i == 0) {
                    /*i=2 → 15%2 ≠ 0 → skip
                    i=3 → 15%3==0, 20%3≠0 → skip
                    i=4 → skip
                    i=5 → divides both → gcd=5
                i=6..15 → none divide both*/
                gcd = i; //gcd = 5.
            }
            i++;
        }
        return gcd;
    }

    public static int least(int first, int second) {
        if(first < second) {
            return first;
        } else {
            return second;
        }
    }
}
