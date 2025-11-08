package Collection_Generics;

public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(4,5,9,4,8,5,7));
        System.out.println(add(5,5,5,5,5));
    }
    public static int sum(int... a) { //... ellipsis
        int sum = 0;
        for (int i : a) {
            sum += i;

        }
        return sum;
    }

    public static int add(int first, int second, int...a) { //... ellipsis,
        int add = first+second;
        for (int i : a) {
            add += i;

        }
        return add;
    }


    public static int sum(int a, int b) {
        return a + b;
    }
}
