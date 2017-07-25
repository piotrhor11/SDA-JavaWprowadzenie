package day8.Examples;

import java.util.*;

/**
 * Created by sp0rk on 06/07/17.
 */
public class Main {

    public static void main(String[] args) {

//        arrays1();
//        arrays2();
//        arrayList();//       arrayList2();
//        hashSet();
//        hashSet2();
        hashMap();
//        hashMap2();

    }

    private static void arrayList2() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);


    }


    static void arrays1() {
        String[] names = new String[3];
        names[0] = "Julian";
        names[1] = "Kornel";
        names[2] = "Krzysztof";
        for (String name : names) {
            System.out.println(name);
        }
    }

    static void arrays2() {
        String[] names = {"Julian", "Kornel", "Krzysztof"};
        for (String name : names) {
            System.out.println(name);
        }
    }

    static void arrayList() {
        ArrayList<String> grocery = new ArrayList<>();

        //Dodawanie elementów
        grocery.add("Apple");
        grocery.add("Orange");
        grocery.add("Bread");

        System.out.println(grocery);
        System.out.println("----");

        //Dodawanie elementów pod konkretnym indeksem
        grocery.add(0, "Butter");
        grocery.add(1, "Cereal");

        System.out.println(grocery);
        System.out.println("----");

        //Usuwanie elementów (na konkretnej pozycji)
        grocery.remove("Orange");
        grocery.remove(0);

        System.out.println(grocery);
        System.out.println("----");

        grocery.set(2, "Banana");

        System.out.println(grocery);
        System.out.println("----");

        if (grocery.contains("Banana"))
            System.out.println("Bananananananana!");

        System.out.println(grocery.get(2));

    }

    static void hashSet() {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(3);
        set.add(6);

        set.remove(3);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        if (set.contains(4)) {
            System.out.println("4 is here");
        }
    }

    static void hashSet2() {

        HashSet<String> subjects = new HashSet<>();

        subjects.add("Math");
        subjects.add("English");
        subjects.add("French");
        subjects.add("French");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("French");

        for (String subject : subjects) {
            System.out.println(subject);
        }
    }

    static void hashMap() {

        HashMap<String, Boolean> attendance = new HashMap<>();

        attendance.put("Jurec", true);
        attendance.put("Juruć", false);
        attendance.put("Buchoń", false);
        attendance.put("Konfanty", true);
        attendance.put("Białkowksa", true);

        for (Map.Entry<String, Boolean> entry : attendance.entrySet()) {
            if (entry.getValue() == true) //można pominąć == true. Napisałem dla widoczności
                System.out.println(entry.getKey() + " here!");
            else
                System.out.println("Absent!");
        }

        System.out.println(attendance.get("Jurec"));

    }

    static void hashMap2() {

        HashMap<String, Boolean> attendance = new HashMap<>();

        attendance.put("Jurec", true);
        attendance.put("Juruć", false);
        attendance.put("Buchoń", false);
        attendance.put("Konfanty", true);
        attendance.put("Białkowksa", true);

        attendance.remove("Juruć");

        System.out.println(attendance);

    }
}
