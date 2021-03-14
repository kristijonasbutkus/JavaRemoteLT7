package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {

        Car car1 = Car.getInstance();

        System.out.println(Car.getName());
    }
}
