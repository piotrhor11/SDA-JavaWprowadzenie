package pl.sda.dzien015.ZadanieDomowe;

public class Main {

    public static void main(String[] args) {

        Dobermann wiktor = new Dobermann("Wiktor");
        Dobermann wiktor2 = new Dobermann("Wiktorek");
        Doge pierun = new Doge("Pierun");
        Doge kamil = new Doge("Kamil");
        Javaness kitty = new Javaness("Kitty");

        wiktor2.speak();
        wiktor2.guardHouse();
//        pierun.speak();
//        pierun.guardHouse();
//        kitty.speak();
//        kitty.purr();

        System.out.println("\nZad3:");
        Zoo zoo = new Zoo("Zoo Juliana");
        zoo.addAnimal(wiktor);
        zoo.addAnimal(wiktor2);             //Nie zostanie dodany do HasSetu, bo jest już Dobermann o imieniu Wiktor
        zoo.addAnimal(pierun);
        zoo.addAnimal(kitty);

        zoo.speakAll();
        System.out.println();
        zoo.getAllNames();

        System.out.println("\nZad4:");
        Shelter<Dog> schronisko1 = new Shelter("Pieskoland");       //Typ zwierząt definiujemy przy deklaracji
        schronisko1.addAnimal(wiktor);
        schronisko1.addAnimal(pierun);
        schronisko1.addAnimal(kamil);
        schronisko1.listAnimals();
        schronisko1.removeAnimal(kamil);
        schronisko1.listAnimals();

        System.out.println("\nZad5:");
        try {
            schronisko1.adoptAnimal(wiktor);
            System.out.println("Udało sie zaadoptować zwierzaka " + wiktor.name);
        } catch (Shelter.AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        schronisko1.listAnimals();
        try {
            schronisko1.adoptAnimal(wiktor2);
            System.out.println("Udało sie zaadoptować zwierzaka " + wiktor2.name);
        } catch (Shelter.AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        schronisko1.listAnimals();

        schronisko1.listAdoptedAnimals();

        System.out.println("\nZad6:");
        for (Animal animal : zoo.getAnimals()) {
            if (animal instanceof ICute) {              // Jeżeli jakieś zwierze w zoo jest ICute to rzutujemy je na interfejs i prosimy o zademonstrowanie :)
                System.out.println(animal.getName() + " is a " + animal.getClass().getSimpleName() + " and is cute:");
                ((ICute) animal).beCute();
            }
        }

        System.out.println("\nZad* - funkcja lambda jako implementacja jedynej funkcji beCute() interfejsu ICute:");
        ICute lambdaCat = () -> System.out.println("I'm lambda cute ;)");
        lambdaCat.beCute();
    }
}
