package advanced.concurrency.example4;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeSeat() {
        if (availableSeats > 0) {
            System.out.println("Take a seat");
            availableSeats--;
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("rukyk desra");
        }
    }

    public synchronized void takeSeatSync() {
        if (availableSeats > 0) {
            System.out.println("Take a seat");
            availableSeats--;
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("rukyk desra");
        }

    }

    public void takeSeatSyncBlock() {
        System.out.println("Unsynced part!");
        synchronized (this) {
            if (availableSeats > 0) {
                System.out.println("Take a seat");
                availableSeats--;
                System.out.println("Available seats: " + availableSeats);
            } else {
                System.out.println("There are no seats abailable. :/");
            }
        }
    }

}

