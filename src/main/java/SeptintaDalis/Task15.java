package SeptintaDalis;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int s = scanner.nextInt();
            array[i] = s;
        }

            for (int i = 0; i < 10; i++) {
                int temp = i;
                int counter = 0;
                for (int j = 1; j < 10; j++) {
                    if (temp == array[j]){
                        counter++;
                    }
                }
                if (counter > 1) {
                    System.out.println(temp + " pasikartojo " + counter + " kartus.");
                }
        }
    }
}
