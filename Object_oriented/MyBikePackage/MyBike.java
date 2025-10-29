package MyBikePackage;

public class MyBike {
    public String color;
    public String model;
    public float maxSpeed;
    private double fuelInLiters;
    int purchasePrice;

    @Override
    public String toString() {
        return "MyBike{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelInLiters=" + fuelInLiters +
                ", purchasePrice=" + purchasePrice +
                '}';
    }

    public MyBike() {

    }

    public MyBike(String color, String model, float maxSpeed, double fuelInLiters, int purchasePrice) {
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuelInLiters = fuelInLiters;
        this.purchasePrice = purchasePrice;
    }
}
