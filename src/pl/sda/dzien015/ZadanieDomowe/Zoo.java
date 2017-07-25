package pl.sda.dzien015.ZadanieDomowe;

import java.util.HashSet;
import java.util.Iterator;

public class Zoo {

    private String name;
    private HashSet<Animal> zoo;

    public Zoo(String name) {
        this.name = name;
        this.zoo = new HashSet<>();
    }

    public void addAnimal(Animal animal) {
        this.zoo.add(animal);
    }

    public void speakAll() {
        for (Animal animal : zoo) {
            animal.speak();
        }
    }

    public void getAllNames() {
        Iterator<Animal> iterator = zoo.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

}
