package advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> visitedCities = new HashSet<>();
        visitedCities.add("Vilnius");
        visitedCities.add("Kaunas");
        visitedCities.add("Siauliai");
        visitedCities.add("Utena");
        //visitedCities.add("Utena");
// setas laiko tik unique reiksmes~!~!@!~@@!@!@
        System.out.println("O G SET");
        for (String city : visitedCities) {
            System.out.println(city);
        }


    }
}
