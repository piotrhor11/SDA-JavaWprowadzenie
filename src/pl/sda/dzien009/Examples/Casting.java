package pl.sda.dzien009.Examples;

public class Casting {
    public static class Animal {
        public int legs;

        public Animal(int legs) {
            this.legs = legs;
        }
    }

    public static class Dog extends Animal {
        public String breed;

        public Dog(String breed) {
            super(4);
            this.breed = breed;
        }
    }

    public static void main(String[] args) {
        Dog spike = new Dog("Collie");
        System.out.println(spike.breed);
        System.out.println(spike.legs);

        Animal unknownDinosaur = new Animal(0);

        System.out.println("dino " + unknownDinosaur.legs);
//        System.out.println(unknownDinosaur.breed);  //Nie skompiluje się

        Animal anonymousSpike = (Animal) spike;
        System.out.println(anonymousSpike.legs);
//        System.out.println(anonymousSpike.breed);   //Nie skompiluje się
//        Dog dinoDog = (Dog) unknownDinosaur;
        System.out.println("----");
        System.out.println(spike instanceof Animal);
        System.out.println(spike instanceof Dog);
        System.out.println("----");
        System.out.println(unknownDinosaur instanceof Animal);
        System.out.println(unknownDinosaur instanceof Dog);
        System.out.println("----");
        System.out.println(anonymousSpike instanceof Animal);
        System.out.println(anonymousSpike instanceof Dog);

        if (anonymousSpike instanceof Dog) {
            System.out.println(((Dog) anonymousSpike).breed);           // Rzutowanie w dół
        }

    }
}
