package advanced.interfaces.example2;

public class InterfaceExampleMain2 {
    public static void main(String[] args) {

        Balloon balloon = new Balloon(50);
        System.out.println(balloon.calculateMaxSpeed());
        System.out.println(balloon.canFly("good"));

        Plane plane = new Plane (600);
        System.out.println(plane.calculateMaxSpeed());
        System.out.println(plane.canFly("good"));

    }
}
