package design_patterns.pizza_factory;

public class MainFactory {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza picyte1 = pizzaFactory.getPizza(1);
        Pizza picyte2 = pizzaFactory.getPizza(2);

        System.out.println(picyte1.getDetectedPizza());
        System.out.println(picyte2.getDetectedPizza());
    }
}
