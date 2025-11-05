package MethodOverrideChallenge;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        MethodOverrideVehicle veh = new MethodOverrideVehicle();
        veh.service();
        car.service();

    }
}
