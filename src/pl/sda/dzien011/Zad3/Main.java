package pl.sda.dzien011.Zad3;

public class Main {

    public static void main(String[] args) {
        GuitarFactory fender = new GuitarFactory("Fender");
        GuitarFactory gibson = new GuitarFactory("Gibson");

        fender.makeGuitar("Stratocaster", 8000);
        gibson.makeGuitar("Les Paul", 6000);
        fender.makeGuitar("Telecaster", 2000);
        gibson.makeGuitar("Firebird", 1800);

        for (Guitar guitar : fender.guitarList) {
            System.out.println(guitar.getModel() + guitar.getSerialNumber());
            guitar.play();
        }
        System.out.println();
        for (Guitar guitar : gibson.guitarList) {
            System.out.println(guitar.getModel() + guitar.getSerialNumber());
        }
        gibson.testGuitars();

    }
}
