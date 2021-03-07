package SeptintaDalis;

import java.util.Scanner;

public class Task16 {

    static int array[] = new int[10];

    public static void main(String[] args) {

        desimtSkaiciu(array);
        int counter = 0;
        int temp = 0;

        for (int i = 0; i < 9; i++) {
            if (array[i] < array[i+1]) {
                counter++;
                //System.out.println(counter);
            }
            else {
                if (counter > temp){
                    temp = counter;
                   // System.out.println(counter);
                    counter = 0;
                }
            }
        }
                temp += 1;
                System.out.println("Ilgiausias skaiciu didejimas yra " + temp);
        }

    static void desimtSkaiciu (int array[]){
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            int s = scanner.nextInt();
            array[i] = s;
        }
    }
}
