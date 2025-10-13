public class car {
    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    public void drive() {
        System.out.println("car is driving");
        currentFuelInLiters--;
    }

    public void fuel(float fuel) {
        currentFuelInLiters+= fuel;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}



