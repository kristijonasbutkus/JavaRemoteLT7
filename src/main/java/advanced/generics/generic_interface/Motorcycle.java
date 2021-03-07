package advanced.generics.generic_interface;

public class Motorcycle implements Comparable<Motorcycle>{

    @Override
    public int compareTo(Motorcycle object) {
        return 0;
    }

    @Override
    public Motorcycle getObject() {
        return this;
    }
}
