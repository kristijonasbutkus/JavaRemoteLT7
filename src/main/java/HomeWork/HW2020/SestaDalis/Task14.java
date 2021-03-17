package HomeWork.HW2020.SestaDalis;

import java.util.Scanner;
import java.lang.*;

public class Task14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite pirmaja latin raide (ASCII) ");
        char raide1lower = Character.toLowerCase(scanner.next().charAt(0));

        System.out.println("Iveskite antraja latin raide (ASCII) ");
        char raide2lower = Character.toLowerCase(scanner.next().charAt(0));

        int ascii = (int) raide1lower;
        int ascii2 = (int) raide2lower;

        if (ascii > ascii2){
            System.out.println("Tarp raidziu " + raide1lower + " ir " + raide2lower + " yra kitos " + (ascii - ascii2 - 1) + " raides");
        }
        else {
            System.out.println("Tarp raidziu " + raide1lower + " ir " + raide2lower + " yra kitos " + (ascii2 - ascii - 1) + " raides");
        }




    }


}
