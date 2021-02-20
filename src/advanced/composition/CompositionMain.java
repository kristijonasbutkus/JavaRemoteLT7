package advanced.composition;

public class CompositionMain {

    public static void main(String[] args) {

        Tv tv = new Tv("UHD", 43);
        Bed bed = new Bed("King-size", "sleep-room");

        Room room1 = new Room(tv, bed);
        Room room2 = new Room (
                new Tv("LCD", 49),
                new Bed("small-size", "rave-room")
        );

    }
}
