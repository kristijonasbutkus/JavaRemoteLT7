/*
Write an application that will read diameter of a circle (variable of type float)
and calculate perimeter of given circle. Firstly, assume π = 3.14. Later, use the
value of π from the built-in Math class.
 */
package PirmaDalis;

import java.lang.Math;
import java.util.Scanner;

public class Task1 {

    static double pi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite apskritimo skersemeni: ");
        float diameter = scanner.nextFloat();

        CirclePerimeterMath(diameter);
        System.out.println("Apskritimo perimetras, naudojant PI kaip 3.14:     " + CirclePerimeter(diameter));
        System.out.println("Apskritimo perimetras, naudojant MATH PI:     " + CirclePerimeterMath(diameter));
    }

    static double CirclePerimeter (float d){
        double r = d / 2;
        return (2 * pi * r);
    }

    static double CirclePerimeterMath (float d) {
        double r = d / 2;
        return (2 * Math.PI * r);
    }


}
