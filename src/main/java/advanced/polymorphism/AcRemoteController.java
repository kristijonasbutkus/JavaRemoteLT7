package advanced.polymorphism;

public class AcRemoteController implements RemoteController {

    @Override
    public void enable(boolean action) {
        if (action){
            System.out.println("Turning Air conditioning on");
        }
    }
}
