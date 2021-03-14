package design_patterns.singleton;

public class Car {

    private static String name = "asdfasdf";
    private static Car car;

    private Car () {

    }

    public static Car getInstance() {
        if (car == null) {
            car = new Car();
        }
        return car;
    }

    public static String getName() {
        return name;
    }


}
