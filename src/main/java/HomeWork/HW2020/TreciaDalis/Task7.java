package HomeWork.HW2020.TreciaDalis;

import java.util.Scanner;
import java.lang.Math;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Math.abs(scanner.nextInt());

        FibonacciNumber(n);
    }

    static void FibonacciNumber(int n) {
        int[] array = new int[n];
        int x1 = 1, sum = 0, x2 = 1;
        System.out.print("Duotame indekse " + n + " yra reiksme: ");

        for (int i = 1; i <= n; ++i) {
            sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
        System.out.println(sum);

    }
}

