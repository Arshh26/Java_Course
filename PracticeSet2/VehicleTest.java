public class VehicleTest{
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new AutoAbs();
        Vehicle v3 = new CarAbs() ;
        v1.display();
        v1.noOfTyres();
        v2.display();
        v2.noOfTyres();
        v3.display();
        v3.noOfTyres();
    }
}
