package Exception_Handling;

public class Try_Catch {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 5;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException art) {
            System.out.println("Can't Divided by Zero");
        }
        System.out.println("Program Restarted...");

    }
}
