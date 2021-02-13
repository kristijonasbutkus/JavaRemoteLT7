package PirmaDalis;

import java.util.Scanner;
import java.lang.Math;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        int height = scanner.nextInt();
        double index = BMI(weight, height);
        System.out.println("Your bodymass index is : " + index);

        if (index >= 18.5 && index <= 24.9) {
            System.out.println("BMI optimal");
        }
        else
            System.out.println("BMI not optimal");
    }

    static double BMI (float weight, int height){
        double temp = weight / Math.pow(height, 2);
        return temp;
    }


}
