package pl.sda.dzien015.ZadanieDomowe;

public class Dobermann extends Dog {

    public Dobermann(String name) {
        super(name, 9);
    }

    @Override
    public void speak() {
        System.out.println("WOOF, WOOF Motherfucker!");
    }

    @Override
    public void guardHouse() {
        System.out.printf("I will bite the shit out of you!!! \n Security level: %d \n", super.getSecurityLevel());
    }
}
