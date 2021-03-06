package advanced.concurrency.example4;

public class BenchMain {
    public static void main(String[] args) {
        Bench bench1 = new Bench(1);
        SeatTakerThread STT1 = new SeatTakerThread(bench1);
        SeatTakerThread STT2 = new SeatTakerThread(bench1);
        SeatTakerThread STT3 = new SeatTakerThread(bench1);
        SeatTakerThread STT4 = new SeatTakerThread(bench1);
        SeatTakerThread STT5 = new SeatTakerThread(bench1);

        STT1.start();
        STT2.start();
        STT3.start();
        STT4.start();
        STT5.start();

        }
}
