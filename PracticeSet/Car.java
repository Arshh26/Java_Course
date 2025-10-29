public class Car {
    static int noOfCarsSold;

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car() {
       this("Black");
       currentFuelInLiters = 5;
    }
    
    static {
       noOfCarsSold = 0;
        System.out.println("I am in static block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init block");
    }

    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can't start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("car is started.. bruhhhh....");
            currentFuelInLiters--;
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("car is driving");
    }

    public void addFuel(float currentFuelInLiters) {
       this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}



