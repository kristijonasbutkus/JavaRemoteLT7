package advanced.classes.inner_classes;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //INNER CLASS

    public class Wheel {

        public void damage() {
            maxSpeed *= 0.5;
        }
    }


}
