public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ThreadExtends thread1 = new ThreadExtends(counter);
        ThreadExtends thread2 = new ThreadExtends(counter);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        counter = new Counter();
        Thread first = new Thread(new ImplementRunnable(counter), "Thread-2");
        Thread second = new Thread(new ImplementRunnable(counter), "Thread-3");
        first.start();
        second.start();

        first.join();
        second.join();

        counter = new Counter();
        ThreadExtends thread3 = new ThreadExtends(counter);
        Thread third = new Thread(new ImplementRunnable(counter), "Thread-4");
        thread3.start();
        third.start();
    }
}
