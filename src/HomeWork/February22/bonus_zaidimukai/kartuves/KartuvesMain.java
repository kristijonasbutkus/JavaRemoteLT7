package HomeWork.February22.bonus_zaidimukai.kartuves;

import java.util.Arrays;

public class KartuvesMain {
    public static void main(String[] args) {

        char[] arei = {'a', 'b', 'c', 'd', 'e', 's'};
        char[] arei2 = {'a', 'b', 'i', 'l', 'a', 's'};

        for (int i = 0; i < arei.length; i++) {
            if (Character.toString(arei[i]).equals(Character.toString(arei2[i]))) {
                arei2[i] = arei[i];
            }
            else{
                arei2[i] = '_';
            }
        }
        for (char c : arei2) {
            System.out.print(c + " ");
        }
        System.out.println(String.valueOf(arei).equals(String.valueOf(arei2)));
        System.out.println(String.valueOf(arei));
        System.out.println(String.valueOf(arei2));


/////////////////////////////////////////////////////////////////
        System.out.println("***********************************");
        System.out.println("**************KARTUVĖS*************");
        System.out.println("***********************************");

        //char[] wordFullArray = new char[Utils.gameInitialize().length()];
        char[] wordFullArray =  Utils.gameInitialize().toCharArray();
        char[] tempWordArray = new char[wordFullArray.length];
        char[] userInputArray = new char [54];
        Arrays.fill(tempWordArray, '_');

        Utils.drawWord(tempWordArray);

        char[] GuessedArray = Utils.getInputFromUser(tempWordArray);

        tempWordArray = Utils.compare(wordFullArray, userInputArray);



    }
}
