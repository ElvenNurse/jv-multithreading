public class ThreadExtends extends Thread {
    private Counter counter;

    public ThreadExtends(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() < Main.RACE_GOAL) {
            counter.increment();
            System.out.println(this.getName() + " : " + counter.getCounter());
        }
    }
}
