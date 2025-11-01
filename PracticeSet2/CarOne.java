public class CarOne{
    static int count;

   CarOne(){
        count++;
    }

    public static void main(String[] args) {
        CarOne c1 = new CarOne();
        CarOne c2 = new CarOne();
        CarOne c3 = new CarOne();
        CarOne c4 = new CarOne();
        CarOne c5 = new CarOne();

        System.out.println(CarOne.count);



    }
}
