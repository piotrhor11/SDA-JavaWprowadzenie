package pl.sda.dzien007.Vehicle;

public class Car extends Vehicle implements HasEngine, HasAirControl {

    public boolean engineRunning;

    public Car() {
        super(4);
    }

    @Override
    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
        }
        System.out.println("Silnik: wyłączony");
    }

    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
        }
        System.out.println("Silnik: włączony");
    }

    @Override
    public void ride() {
        System.out.println("Odpalamy!");
        turnOnAC(18);
        startEngine();
    }

    @Override
    public void brake() {
        System.out.println("Zatrzymujemy się");
        turnOff();
        stopEngine();
    }

    @Override
    public void turnOnAC(int temp) {
        System.out.println("AC - ON, setting " + temp + "C");
    }

    @Override
    public void turnOff() {
        System.out.println("AC - OFF");
    }
}
