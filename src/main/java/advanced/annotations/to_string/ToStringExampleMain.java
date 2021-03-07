package advanced.annotations.to_string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ToStringExampleMain {
    public static void main(String[] args) {
        Object1 object1 = new Object1();
        Object2 object2 = new Object2();

        System.out.println("object1 to string : " + object1.toString());
        System.out.println("object2 to string : " + object2.toString());
    }
}
