package design_patterns.pizza_factory;

public class PizzaFactory {

    public Pizza getPizza (int number){
        Pizza pizza;
        switch (number) {
            case 1:
                pizza = new Margarita();
                break;
            case 2:
                pizza = new Hawaii();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
