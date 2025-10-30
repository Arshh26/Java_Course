package com.example.util;

import com.example.geomatry.Circle;
import com.example.geomatry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rec = new Rectangle(10,5);

        double cirAre = Math.PI * Math.pow(cir.radius, 2);
        double areRec = rec.length * rec.breadth;

        System.out.printf("Area of the circle is: %f,\nArea of Rectangle is: %f", cirAre, areRec);

    }
}
