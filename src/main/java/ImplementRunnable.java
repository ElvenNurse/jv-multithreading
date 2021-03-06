public class ImplementRunnable implements Runnable {
    private Counter counter;

    public ImplementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() < Main.RACE_GOAL) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + " : " + counter.getCounter());
        }
    }
}
