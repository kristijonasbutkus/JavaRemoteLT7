package advanced.enumerators;

public class EnumExampleMain {
    public static void main(String[] args) {
        System.out.println(Coffee.LATTE.name());

        Coffee coffee = Coffee.valueOf("LATTE");
        System.out.println(coffee.name());

        System.out.println(CarMaker.AUDI.fullName + " " + CarMaker.AUDI.establishedIn);
    }
}
