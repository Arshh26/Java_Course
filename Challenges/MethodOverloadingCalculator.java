public class MethodOverloadingCalculator {
    public int add(int a, int b) {
      return a + b;
    }

   public int add(int a, int b, int c) {
        return a + b + c;
   }

   public double add(double a, double b) {
        return a + b;
   }

    public static void main(String[] args) {
        MethodOverloadingCalculator a  = new MethodOverloadingCalculator();
        System.out.println(a.add(5,40));
        System.out.println( a.add(12.4,23.2));
        System.out.println(a.add(20,45,8));
    }
}
