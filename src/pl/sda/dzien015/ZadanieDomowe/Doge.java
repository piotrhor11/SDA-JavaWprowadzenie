package pl.sda.dzien015.ZadanieDomowe;

public class Doge extends Dog {

    protected Doge(String name) {
        super(name, 3);
    }

    @Override
    public void speak() {
        System.out.println("Wow! Much Java! Many classes! So expert!");
    }

    @Override
    public void guardHouse() {
        System.out.printf("Wow! So scared! Much danger! \n Security level: %d \n", super.getSecurityLevel());
    }
}
