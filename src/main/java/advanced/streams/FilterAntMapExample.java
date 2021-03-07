package advanced.streams;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterAntMapExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        //Isspausdinti vardus, kurie prasideda raide B
        //1 budas:
        /*for (int i = 0; i < names.size(); i++) {
            if(names.get(i).startsWith("B")){
                System.out.println(names.get(i));
            }
        }*/

        //2 budas:
        names.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(name -> System.out.println(name));


        //Paversti vardu listo reiksmes i reiksmiu ilgi
        /*List<Integer> namesInNumbers = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            namesInNumbers.add(names.get(i).length());
        }
        System.out.println(namesInNumbers);
         */
        List<Integer> namesInNumbers = names.stream()
                .map(name -> name.length())
                .filter(length -> length > 5)
                .map(number -> number * 69)
                .collect(Collectors.toList());
        System.out.println(namesInNumbers);
    }
}
