public class AverageAndSum {
    public static void main(String[] args) {
        int[] numsArray = PracArrayUtility.pracInputArray();
        long sum = sum(numsArray);
        double avg = average(numsArray);
        System.out.println("Your total sum is: "+ sum);
        System.out.println("Your total avg is: "+ avg);
    }

    public static long sum(int[] numsArray){
        int sum = 0;
        int i = 0;
        while (i < numsArray.length) {
            sum += numsArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numsArray) {
        double sum = sum(numsArray);
        return (sum / numsArray.length);
    }
}
