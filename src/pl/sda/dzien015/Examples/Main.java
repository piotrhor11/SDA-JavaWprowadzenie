package pl.sda.dzien015.Examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Main {
    public static void main(String[] args) {
//        runnableThread();
//        executors();
        synchronize();
    }

    private static void runnableThread() {
        HelloRunnable hR = new HelloRunnable();
        hR.run();
        hR.run();

        System.out.println("---");
        Thread t = new Thread(hR);
        t.start();                              //odpalamy hR w nowym wątku "t"
        System.out.println(t.getName());        //to wyswietli sie najpierw, bo to na gorze czeka 2 s i dopiero sie wyswietla.

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Yo: " + Thread.currentThread().getName());       //"Yo..." z wątku t2 Wyświetli się przed wątkiem t, bo ma krótszy timeout
            }
        });
        t2.start();          //odpalamy drugi wątek z anonimowym obiektem podanym w argumencie
    }

    private static void executors() {
        ExecutorService executor = Executors.newSingleThreadExecutor();     //Korzystamy z paczki Executors i tworzymy prosty Executer, alternatywnie są inne dostepne
        executor.submit(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("I am " + threadName);
            }
        });
        executor.shutdown();
        System.out.println("Executor ordered to shut down");

    }

    private static void synchronize() {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
    }
}
