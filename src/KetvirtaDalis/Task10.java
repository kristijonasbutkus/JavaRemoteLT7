package KetvirtaDalis;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
       // double sum = 0.0;
        int[] array = new int[0];

            int suma = 0;
            while (input > 0) {
                suma += input % 10;
                input = input / 10;
            }
            System.out.println(suma);
        }



    }

