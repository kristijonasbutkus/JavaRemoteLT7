package HomeWork.Task5;

import java.lang.Math;


public class Circle {
    double radius;
    String color;

    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public static double circleArea (Circle circle){
        return Math.pow(Math.PI * circle.radius, 2);
    }

    public static double circlePerimeter (Circle circle){
        return (2 * Math.PI * circle.radius);
    }
}
