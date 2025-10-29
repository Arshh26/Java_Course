package MyBikePackageRun;

import MyBikePackage.MyBike;

public class MyBikeRun {
    public static void main(String[] args) {
        MyBike myBike = new MyBike("Blue", "R15", 200, 4.5, 5000);
        MyBike pulsor = new MyBike();
        pulsor.color = "red";
        pulsor.model = "NS 200";
        pulsor.maxSpeed = 200;


        System.out.println(pulsor);
        System.out.println(myBike);
    }
}
