package pl.sda.dzien014.Zadania;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerUtils {

    public static <T> ArrayList<T> listOf(T... items) {
        ArrayList<T> list = new ArrayList<>();
//        for (T item : items) {
//            list.add(item);
//        }
        Collections.addAll(list, items);                //Alternatywa z paczki Collections do naszego foreach
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = ContainerUtils.listOf("Piotr", "Michał", "Paweł", "Konrad", "Julian", "Sławek", "Lukasz");
        System.out.println(strings);
        ArrayList<Integer> numbers = ContainerUtils.listOf(2, 3, 5, 7, 11, 13, 17, 19);
        System.out.println(numbers);
    }

}

