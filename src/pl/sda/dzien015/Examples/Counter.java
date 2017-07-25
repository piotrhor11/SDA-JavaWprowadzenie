package pl.sda.dzien015.Examples;

class Counter {

    int count = 0;

    synchronized void increment(int value) {
        int x = count;
        System.out.println(count);
        count = x + 1;
    }
}
