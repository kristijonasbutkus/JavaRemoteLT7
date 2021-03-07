package HomeWork.February22.bonus_zaidimukai.kartuves;

import java.io.*;
import java.util.Arrays;
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

    public static String getInputFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSpekite raide arba visa zodi.\n");

        //if (tempLine.length() == 1) {
         //   a[0] = tempLine.charAt(0);
        //}
        //else {
         //   a = tempLine.toCharArray();
        //}
        return scanner.nextLine().toUpperCase();
    }

    public static char[] compareGuess(char[] originalArray, String userInput, char[] temp) {
        if (userInput.length() == 1) {
            System.out.println("Speta raide: " + userInput);
            for (int i = 0; i < originalArray.length; i++) {
                if (Character.toString(originalArray[i]).equals(userInput)) {
                    System.out.println("Atspejote raide!\n");
                    temp[i] = userInput.charAt(0);

                }
            }
        }
        else if (userInput.length() > 1) {
            System.out.println("Spetas zodis: " + userInput);

            if (String.valueOf(originalArray).equals(userInput)) {
                System.out.println("Atspejote visa zodi!\n Pasleptas zodis buvo" + String.valueOf(originalArray));
            }
            else {
                System.out.println("Deja, nepataikete.. zaidima teks pradeti is naujo");
            }
        }
        else {
            System.out.println("Klaida! klaida :)");
        }
        return temp;
    }

    public static void printArray (char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
    }

}
