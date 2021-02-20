package advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("Latvia");
        visitedCountries.add("Spain");
        visitedCountries.add("Germany");
        visitedCountries.add("Poland");

        //visitedCountries.remove("Latvia");
        visitedCountries.remove("Germany");

        if (visitedCountries.contains("Latvia")){
            System.out.println("Set contains Latvia");
        }

        for (String country : visitedCountries){
            System.out.println(country);
        }
    }
}
