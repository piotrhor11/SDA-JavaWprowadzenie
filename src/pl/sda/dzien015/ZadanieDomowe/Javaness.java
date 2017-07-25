package pl.sda.dzien015.ZadanieDomowe;

public class Javaness extends Cat {

    protected Javaness(String name) {
        super(name);
    }

    @Override
    void purr() {
        System.out.println("Java doesn't purr!!!");
    }

    @Override
    public void speak() {
        System.out.println("Meow for Java!!!");
    }
}
