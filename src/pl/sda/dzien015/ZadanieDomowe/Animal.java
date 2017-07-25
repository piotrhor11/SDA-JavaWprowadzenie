package pl.sda.dzien015.ZadanieDomowe;

/**
 * Created by Piotrek on 17.07.2017.
 */
public abstract class Animal {

    protected String name = "";

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void speak();

    public final String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
