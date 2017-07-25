package pl.sda.dzien007.Vehicle;

public abstract class Vehicle {

    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public final int getWheels() {      // final zeby klasy dziedziczace nie mogly jej nadpisac
        return wheels;
    }

    public abstract void ride();

    public abstract void brake();

}
