package advanced.inheritance.animal_example;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("green", "miau-miau", true);
        Dog dog1 = new Dog("Bulldogas", "au-au", true);

        System.out.println(cat1.yieldVoice());
        System.out.println(dog1.yieldVoice());

    }
}
