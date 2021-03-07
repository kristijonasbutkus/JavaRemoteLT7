package advanced.polymorphism;

// polimorfizmas !!!!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
public class PolymorphismExampleMain {
    public static void main(String[] args) {
        RemoteController remote = new TvRemoteController();
        remote.enable(true);
        System.out.println(remote.getClass().getSimpleName());

        remote = new AcRemoteController();
        System.out.println(remote.getClass().getSimpleName());

        TvRemoteController tvRemoteController = new TvRemoteController();
        AcRemoteController acRemoteController = new AcRemoteController();

        printRemoteControllerObject(tvRemoteController);
        printRemoteControllerObject(acRemoteController);
        printRemoteControllerObject(remote);

    }

    private static void printTvObject(TvRemoteController tv) {
        System.out.println(tv.getClass().getSimpleName());
    }

    private static void printAcObject(AcRemoteController ac) {
        System.out.println(ac.getClass().getSimpleName());
    }

    private static void printRemoteControllerObject(RemoteController remote) {
        System.out.println(remote.getClass().getSimpleName());
    }

}
