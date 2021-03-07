package PenktaDalis;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String zodis = scanner.nextLine();

        String[] zodziuMasyvas = zodis.split("\\s", 99);

        System.out.println(zodis.matches("(.*)Tutorials(.*)"));
    }
}
