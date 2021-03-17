package HomeWork.HW2020.AntraDalis;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skaicius = scanner.nextInt();
        if (skaicius > 0){
            for (int i = 1; i <= skaicius; i++) {
                if (i % 3 == 0 && i % 7 == 0){
                    System.out.println("Fizz buzz");
                }
                else if (i % 3 == 0){
                    System.out.println("Fizz");
                }
                else if (i % 7 == 0){
                    System.out.println("Buzz");
                }
                else System.out.println(i);
            }
        }
        else return;
    }
}
