public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if(i == 100) {
                break;
            }
            System.out.println(i);
            System.out.println( );
        }
        for (int i = 0; i <= 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);

       }
    }
}



