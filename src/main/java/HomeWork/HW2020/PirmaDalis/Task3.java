package HomeWork.HW2020.PirmaDalis;

import java.util.Scanner;
import java.lang.Math;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double delta = Math.pow(b,2) - (4 * a * c);
        //System.out.println(delta);

        if (delta < 0){
            System.out.println("Delta negative");
            return;
        }
        else {
            double x2 = (((-b) + (Math.sqrt(delta)))) / (2 * a);
            //b *= -1;
            double x1 = (((-b) - (Math.sqrt(delta)))) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}
