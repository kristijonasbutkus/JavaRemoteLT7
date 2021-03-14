package design_patterns.singleton;

public class Pizza {
    private static Pizza pizza;
    private int pizzaCounter = 0;

    private Pizza() {
        System.out.println("CONSTRUCTOR");
    }

    public static Pizza getInstance(){
        if(pizza == null){
            pizza = new Pizza();
        }
        return pizza;
    }


    public void cookPizza(){
        pizzaCounter++;
    }

    public int getPizzaCounter() {
        return pizzaCounter;
    }

    public static void main(String[] args) {
        Pizza myPizza1 = Pizza.getInstance();
        Pizza myPizza2 = Pizza.getInstance();
        myPizza1.cookPizza();
        myPizza1.cookPizza();
        myPizza2.cookPizza();

        // matome, kad tas pats instance
        System.out.println(myPizza1);
        System.out.println(myPizza2);

//        atspausdina ta pati nes mes ziurime kiek picu iskepta toje pacioje kepykloje.
//        kadangi skirtingi zmones ziuri kiek picu iskepta toje pacioje kepykloje
        System.out.println(myPizza1.getPizzaCounter());
        System.out.println(myPizza2.getPizzaCounter());

    }


}
