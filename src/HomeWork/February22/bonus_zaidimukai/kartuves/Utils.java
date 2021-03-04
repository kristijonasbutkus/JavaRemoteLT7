package HomeWork.February22.bonus_zaidimukai.kartuves;

import java.io.*;
import java.util.Scanner;

public class Utils {

    public static final String WORD_TO_GUESS_FILE_LOCATION = "E:\\Java stuff\\src\\HomeWork\\February22\\bonus_zaidimukai\\kartuves\\Word.txt";

    public static String gameInitialize() {
        String tempLine = null;
        try {
            FileReader fileReader = new FileReader(WORD_TO_GUESS_FILE_LOCATION);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            tempLine = bufferedReader.readLine().toUpperCase();

            bufferedReader.close();

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return tempLine;
    }

    public static char[] getInputFromUser ( char[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSpekite raide arba visa zodi.\n");
        String tempLine = scanner.nextLine().toUpperCase();

        if (tempLine.length() != 1) {
            a[0] = tempLine.charAt(0);
        }
        else {
                a = tempLine.toCharArray();
        }
        return a;
    }

     public static void drawWord(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
            System.out.println("");
    }

    public static char[] compare (char[] original, char[] userInput) {
        char[] temp = new char[original.length];

        if (userInput.length == 1) {
            System.out.println("Speta raide: " + userInput[0]);
            for (int i = 0; i < original.length; i++) {
                if (Character.toString(original[i]).equals(Character.toString(userInput[0]))) { // check if correct
                    temp[i] = userInput[0];
                    System.out.println("pataikete raide");
                }
                else {
                    temp[i] = '_';
                }
            }
        }
        else if (userInput.length > 1) {
            System.out.println("Spetas zodis: " + String.valueOf(userInput));
            if (String.valueOf(original).equals(String.valueOf(userInput))) {
                System.out.println("Atspejote!");
               // System.out.println(String.valueOf(original));
               // System.out.println(String.valueOf(userInput));
            }
        }
        else {
            System.out.println("Klaida! klaida :)");
        }
        return temp;
    }

}
