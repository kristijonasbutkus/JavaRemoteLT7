package advanced.interfaces.example2;

import java.util.Random;

public class Plane extends AirTransport implements Fly{

    public Plane (int speed){ super(speed);}

    @Override
    public int calculateMaxSpeed(){
        Random random = new Random();
        return random.nextInt();
    }

    @Override
    public boolean canFly(String condition) {
        return true;
    }
}
