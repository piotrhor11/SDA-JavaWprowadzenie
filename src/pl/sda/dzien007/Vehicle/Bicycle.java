package pl.sda.dzien007.Vehicle;

public class Bicycle extends Vehicle {

    public Bicycle() {
        super(2);
    }

    @Override
    public void ride() {
        System.out.println("Jade rowerem");
    }

    @Override
    public void brake() {
        System.out.println("Hamujemy!!!");
    }
}
