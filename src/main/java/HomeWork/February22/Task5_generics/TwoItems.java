package HomeWork.February22.Task5_generics;

public class TwoItems<T> {

    private T entry1;
    private T entry2;

    public TwoItems(T entry1, T entry2) {
        this.entry1 = entry1;
        this.entry2 = entry2;
    }

    public T getEntry1() {
        return entry1;
    }

    public T getEntry2() {
        return entry2;
    }

    //public void setEntry1(T entry1) {
    // this.entry1 = entry1;
    // }

    public String toString(T entry1) {
        return "TwoItems: " + entry1;
    }
}
