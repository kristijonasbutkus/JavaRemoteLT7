package HomeWork.February22.Task5_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("*********************\nPart 1\n*********************");

        TwoItems intItems = new TwoItems(5,8);
        TwoItems stringItems = new TwoItems("dobilelis","supynes");

        System.out.println("intItems: " + intItems.getEntry1() + " " + intItems.getEntry2());
        System.out.println("stringItems: " + stringItems.getEntry1() + " " + stringItems.getEntry2());

        System.out.println("*********************\nPart 2\n*********************");

        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        String stringTemp = "Ne ";
        int intTemp = 10;

        //Listu uzpildymas
        for (int i = 0; i < 5; i++) {
            stringList.add(stringTemp);
            integerList.add(intTemp);
            stringTemp = stringTemp + "Ne ";
            intTemp = intTemp + 5;
        }

        //Listo atspausdinimas
        Utils.printLast(stringList);
        Utils.printLast(integerList);

    }
}
