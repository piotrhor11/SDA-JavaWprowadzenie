package pl.sda.dzien008.Zadanie1;

public class Main {

    public static void main(String[] args) {
        Place komin = new Place("Krzywy Komin", 4);
        Place hex = new Place("Hex", 3);
        Place czajownia = new Place("Czajownia", 2);
        Place nowehoryzonty = new Place("Nowe Horyzonty", 3);
        Place rynek = new Place("Rynek", 12);

        Trip wycieczka1 = new Trip();
        wycieczka1.addPlace(komin);
        wycieczka1.addPlace(hex);
        wycieczka1.addPlace(komin);
        wycieczka1.addPlace(czajownia);
        wycieczka1.printRoute();
        System.out.println("Zwiedzanie zajmie " + wycieczka1.calculateDuration() + " godzin");
        System.out.println();

        wycieczka1.removePlace(komin);      // zostanie usuniety pierwszy znaleziony
        wycieczka1.printRoute();
        System.out.println("Zwiedzanie zajmie " + wycieczka1.calculateDuration() + " godzin");
        System.out.println();

        wycieczka1.setPlace(1, nowehoryzonty);
        wycieczka1.printRoute();
        System.out.println("Zwiedzanie zajmie " + wycieczka1.calculateDuration() + " godzin");
        System.out.println();

        wycieczka1.setPlace(10, rynek);
        wycieczka1.printRoute();
        System.out.println("Zwiedzanie zajmie " + wycieczka1.calculateDuration() + " godzin");
    }
}
