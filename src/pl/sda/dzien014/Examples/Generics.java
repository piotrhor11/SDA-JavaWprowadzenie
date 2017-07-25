package pl.sda.dzien014.Examples;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static class ValueLogEntry<T> {
        private final LocalDateTime dateCreated = LocalDateTime.now();          //To wykonuje się niemal
        private final T value;

        public ValueLogEntry(T value) {
            this.value = value;
        }

        public LocalDateTime getDateCreated() {
            return dateCreated;
        }

        public T getValue() {
            return value;
        }
    }

    public static <T> T printAndReturn(T var) {
        System.out.println(var);
        return var;
    }

    public static <T> void myPrint(T var) {         //T to nazwa typu zmiennej
        System.out.println(var.toString());
    }

    public static void main(String[] args) {
        myPrint(45.6);
        myPrint("Bla bla");
        myPrint(new Exception());
        System.out.println();

        ValueLogEntry<String> entry = new ValueLogEntry<>("Test string");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        ValueLogEntry<List> listEntry = new ValueLogEntry<>(list);

        System.out.println(entry.getDateCreated() + entry.getValue());
        System.out.println(listEntry.getDateCreated() + listEntry.getValue().toString());

        System.out.println("------");
        System.out.println(printAndReturn("Eleven").length());
        System.out.println("-----");
        System.out.println(printAndReturn(15) + 20);
    }
}
