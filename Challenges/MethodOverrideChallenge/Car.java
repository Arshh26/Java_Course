package MethodOverrideChallenge;

public class Car extends MethodOverrideVehicle {
    @Override
    public void service() {
        super.service();
        System.out.println("Car is getting serviced");
    }
}
