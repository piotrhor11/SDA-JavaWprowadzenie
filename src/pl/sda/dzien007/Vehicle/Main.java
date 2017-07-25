package pl.sda.dzien007.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Bicycle();

        v1.ride();
        v1.brake();
        System.out.println(v1.getWheels());

        Vehicle v2 = new Motorbike();
        v2.ride();                      //Nie sprawdzimy czy silnik jest uruchomiony b

        HasEngine v3 = new Motorbike();
        v3.startEngine();

        Motorbike v4 = new Motorbike();
        v4.ride();
        System.out.println(v4.engineRunning);

        Car v5 = new Car();
        v5.ride();
        v5.brake();

        //  W komentarzu wersja z listowaniem po interfejsie
        List<Vehicle> list = new ArrayList<>();     //List<HasEngine> list = new ArrayList<>();
        list.add(new Bicycle());        // Bicycle nie moze byc!!!
        list.add(new Motorbike());
        list.add(new Car());

        for (Vehicle v : list) {        //for(HasEngine v : list) {
            System.out.println("\n" + v.getClass().getSimpleName() + ":");
            v.ride();      //v.startEngine();
            v.brake();      //v.stopEngine();
        }

    }

}
