package advanced.concurrency.example3;

public class Stopwatch extends Thread {

    private String threadName;

    public Stopwatch (String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
