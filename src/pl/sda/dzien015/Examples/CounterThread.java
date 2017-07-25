package pl.sda.dzien015.Examples;

/**
 * Created by sp0rk on 17/07/17.
 */
class CounterThread extends Thread {
    private static int numberOfCounters = 0;
    private Counter counter = null;
    private int id;

    CounterThread(Counter counter) {
        id = ++numberOfCounters;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread " + id);
            counter.increment(1);
        }
        System.out.println("Ostatecznie: " + counter.count);
    }
}
