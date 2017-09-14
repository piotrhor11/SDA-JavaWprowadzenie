package pl.sda.dzien015.ZadanieDomowe;


public abstract class Cat extends Animal implements ICute {

    protected Cat(String name) {
        super(name);
    }

    abstract void purr();

}
