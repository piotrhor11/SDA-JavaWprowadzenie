package pl.sda.dzien015.ZadanieDomowe;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Shelter<T extends Animal> {

    private String name;
    private HashSet<T> animals;
    private HashMap<T, LocalDateTime> adoptions = new HashMap<>();

    public <T> Shelter(String name) {
        this.name = name;
        animals = new HashSet<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void removeAnimal(T animal) {
        animals.remove(animal);
    }

    public void listAnimals() {
        System.out.println("In the shelter " + this.name + " we've got: ");
        for (T animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " " + animal.getName());
        }
    }

    public void adoptAnimal(T animal) throws AnimalNotFoundException {
        if (animals.contains(animal)) {
            animals.remove(animal);
            adoptions.put(animal, LocalDateTime.now());
        } else {
            throw new AnimalNotFoundException("Animal " + animal.name + " not found in shelter " + this.name);                //ToDo wpakować tu jakiś message do klasy wywołujacej!
        }
    }

    public void listAdoptedAnimals() {
        System.out.println("Adopted animals:");
        for (T animal : adoptions.keySet()) {
            System.out.println(animal.getName() + " adopted on " + adoptions.get(animal).toLocalDate());
        }
    }

    public static class AnimalNotFoundException extends Exception {
        public AnimalNotFoundException() {
            super();
        }

        public AnimalNotFoundException(String message) {
            super(message);
        }
    }

}
