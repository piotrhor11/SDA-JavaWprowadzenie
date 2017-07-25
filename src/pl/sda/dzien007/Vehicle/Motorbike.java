package pl.sda.dzien007.Vehicle;

public class Motorbike extends Vehicle implements HasEngine {

    public boolean engineRunning;          // Defaultowo typ boolean jest false

    public Motorbike() {
        super(2);
    }

    @Override
    public void ride() {
        startEngine();
        System.out.println("Jadę motorem");
    }

    @Override
    public void brake() {
        stopEngine();
        System.out.println("Hamuję mój motorek :)");
    }

    @Override
    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            System.out.println("Stop engine");
        }
    }

    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Start engine!");
        }
    }
}
