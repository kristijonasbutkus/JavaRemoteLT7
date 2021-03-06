package advanced.concurrency.example3;

public class ConcurrencyExample3 {

    public static void main(String[] args) {
        System.out.println("Main thread starts");

        Stopwatch sw1 = new Stopwatch("SW1");
        Stopwatch sw2 = new Stopwatch("SW2");
        Stopwatch sw3 = new Stopwatch("SW3");

        sw1.start();

        try {
            Thread.sleep(1000);
            sw2.start();
            System.out.println("Main thread is still running");

            Thread.sleep(3000);
            System.out.println("Main thread ends");
        }
        catch (InterruptedException e) {
            System.out.println("Thread was interrupted on sleep");
        }

    }
}
