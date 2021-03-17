package HomeWork.HW2020.AstuntaDalis;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        while (!a.matches("(acho+!)")) {

            System.out.println(a.matches("acho+!"));
            String b = scanner.nextLine();
        }
        System.out.println("end of program");

    }



}
