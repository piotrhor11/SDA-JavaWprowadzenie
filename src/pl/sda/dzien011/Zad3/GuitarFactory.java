package pl.sda.dzien011.Zad3;

import java.util.ArrayList;

public class GuitarFactory {

    String name;
    ArrayList<Guitar> guitarList = new ArrayList<>();

    public GuitarFactory(String name) {
        this.name = name;
    }

    public Guitar makeGuitar(String model, int price) {
        Guitar guitar = new Guitar(model, price);
        guitarList.add(guitar);
        return guitar;
    }

    public void testGuitars() {
        for (Guitar guitar : guitarList) {
            guitar.play();
        }
    }
}
