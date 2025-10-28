public class StringFormat {
    public static void main(String[] args) {
        int marks = 45;
        int price = 45000;
        String name = "Arshad";
        System.out.printf("Hello %s your marks is %d \n", name, marks);
        System.out.printf("Hello %-15s your marks is %d \n", name, marks);
        System.out.printf("Hello %15s your marks is %d\n", name, marks);
        System.out.printf("Hello %-15s your marks is %d\n", name, marks);
        System.out.printf("Hello %s your Price is %,d\n", name, price);
        System.out.printf("Hello %s your Price is %+,d\n", name, price);
        System.out.printf("Hello %s your Price is %-+,15d .....\n", name, price);
        System.out.printf("Hello %s your Price is %0,15d...\n", name, price);

    }
}