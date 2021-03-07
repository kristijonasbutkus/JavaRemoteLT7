package HomeWork.February22.Task5_generics;

import java.util.List;

public class Utils<G> {

    public static <G> void printLast(List<G> list) {
        System.out.println(list.get(list.size() - 1 ));
    }

}
