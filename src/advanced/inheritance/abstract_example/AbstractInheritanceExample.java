package advanced.inheritance.abstract_example;

public class AbstractInheritanceExample {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", 33);
        System.out.println(car1.vehicleMaxSpeed());

        Ship ship11 = new Ship("Didelis", 49);
        System.out.println(ship11.vehicleMaxSpeed());
    }

}
