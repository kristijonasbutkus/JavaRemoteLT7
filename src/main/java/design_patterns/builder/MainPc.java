package design_patterns.builder;

public class MainPc {


    public static void main(String[] args) {
//        Computer myPc = new Computer("HDd", "RAM", true, true);
//        Computer myPc2 = new Computer("HDd", "RAM", false, false, null);

//        Computer myWorkPc = new Computer("HDd", "RAM");
//        Computer myWorkPc2 = new Computer("HDd", "RAM", 4);

        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder("ram", "hdd");
        Computer myComputerObject = computerBuilder
                .withBluetoothEnabled(false)
                .withGraphicsCardEnabled(true)
                .build();
    }

}


