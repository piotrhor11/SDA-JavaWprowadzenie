package pl.sda.dzien015.ZadanieDomowe;

public class Main {

    public static void main(String[] args) {

        Dobermann wiktor = new Dobermann("Wiktor");
        Dobermann wiktor2 = new Dobermann("Wiktor");
        Doge pierun = new Doge("Pierun");
        Javaness kitty = new Javaness("Kitty");

        wiktor2.speak();
        wiktor2.guardHouse();
//        pierun.speak();
//        pierun.guardHouse();
//        kitty.speak();
//        kitty.purr();

        Zoo zoo = new Zoo("Zoo Juliana");
        zoo.addAnimal(wiktor);
        zoo.addAnimal(wiktor2);
        zoo.addAnimal(pierun);
        zoo.addAnimal(kitty);

        zoo.speakAll();
        System.out.println();

        zoo.getAllNames();
    }
}
