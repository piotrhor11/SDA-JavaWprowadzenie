package pl.sda.dzien011.Examples;

/**
 * Created by sp0rk on 11/07/17.
 */
public class Car {
    private static int numberOfCars = 0;

    private int serialNumber;
    private String colour;
    private boolean isUsed;
    private int mileage;
    private String name;

    public Car(String colour, boolean isUsed, int mileage, String name) {
        this.colour = colour;
        this.isUsed = isUsed;
        this.mileage = mileage;
        this.name = name;
        serialNumber = ++numberOfCars;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public int getSerialNumber() {
        return serialNumber;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Car c = new Car("black", true, 150000, "Punto");
        Car c2 = new Car("white", false, 0, "Seicento");
        System.out.println(c.getName() + c.getSerialNumber());
        System.out.println(c2.getName() + c2.getSerialNumber());
        System.out.println();
        System.out.println(Car.getNumberOfCars());
    }
}
