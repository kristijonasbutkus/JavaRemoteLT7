package advanced.inheritance.abstract_example;

public class Ship extends Vehicle {

    private String type;

    public Ship(String type, int maxSpeed) {
        super(maxSpeed);
        this.type = type;
    }



    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 20 + 20;
    }


}
