package MyPackage.Array;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class statistics {
        double mean() {
            long sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return  sum/numbers.length;
        }

        double median() {
            return 0;
        }

    }
}
