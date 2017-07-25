package pl.sda.dzien015.ZadanieDomowe;


public abstract class Dog extends Animal {

    protected int securityLevel;

    protected Dog(String name, int securityLevel) {
        super(name);
        this.securityLevel = securityLevel;
    }

    public abstract void guardHouse();

    protected int getSecurityLevel() {
        return securityLevel;
    }
}