package advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ReduceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

//  outputas reikalingas: "Tom : Brandon : Michael"

// Naudojant reduce metoda : !!!!!!!!!!!!!!
        String text = names.stream()
                .reduce("", (currentValue, nameListElement) -> (currentValue.isEmpty()
                        ? "" : currentValue + " : ") + nameListElement);
        //System.out.println(text);

        //1-a iteracija: text = "", currentValue = "", nameListElement = "Tom"
        //2-a iteracija: text = "", currentValue = "Tom", nameListElement = "Brandon"
        //3-a iteracija: text = "", currentValue = "Tom : Brandon", nameListElement = "Michael"
        //Po visu iteraciju text yra lygus = "Tom : Brandon : Michael"

        int num = names.stream()
                .map(name -> name.length())
                .reduce(0,
                        (currentSum, namesListNumber) -> (namesListNumber > 3 ? 1 : 0) + currentSum
                        );
        //System.out.println(num);

        //1-a: currentSum = 0, namesListNumber = 3     currentSum = 0
        //2-a: currentSum = 0, namesListNumber = 7     currentSum = 1
        //3-a: cirremtSum = 1, namesListNumber = 7     currentSum = 2


        List<String> zodziai = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas", "PempeDviratis");

        String concatenatedString = zodziai.stream()
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatenatedString);

        String concatenatedStringInCapital = zodziai.stream()
                .map(word -> word.toUpperCase())
                .reduce("", (concatenatedText, word) -> concatenatedText + word);
        System.out.println(concatenatedString);

        ///////

        String concatenatedStringOP = zodziai.stream()
                .filter(word -> word.length() > 5)
                .reduce("", (concatenatedText, word) -> (concatenatedText.isEmpty() ? "" : concatenatedText + ", ") + word
        );
        System.out.println(concatenatedStringOP + ".");
    }

}
