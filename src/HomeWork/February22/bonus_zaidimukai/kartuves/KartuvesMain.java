package HomeWork.February22.bonus_zaidimukai.kartuves;

import java.util.Arrays;

public class KartuvesMain {
    public static void main(String[] args) {

        //System.out.println("***********************************");
        //System.out.println("**************KARTUVĖS*************");
        //System.out.println("***********************************");

        //char[] wordFullArray = new char[Utils.gameInitialize().length()];
        char[] wordFullArray =  Utils.gameInitialize().toCharArray();

        char[] tempWordArray = new char[wordFullArray.length];
        Arrays.fill(tempWordArray, '_');

        do {
            Utils.printArray(tempWordArray);
            String userInput = Utils.getInputFromUser();

            tempWordArray = Utils.compareGuess(wordFullArray, userInput, tempWordArray);

        } while (String.valueOf(tempWordArray).contains("_"));







        //for later
        //StringBuilder str = new StringBuilder();
        //str.append();
    }
}
