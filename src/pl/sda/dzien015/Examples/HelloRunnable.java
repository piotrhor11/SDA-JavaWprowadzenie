package pl.sda.dzien015.Examples;

import java.util.concurrent.TimeUnit;

/**
 * Created by sp0rk on 17/07/17.
 */
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World: " + Thread.currentThread().getName());
    }
}
