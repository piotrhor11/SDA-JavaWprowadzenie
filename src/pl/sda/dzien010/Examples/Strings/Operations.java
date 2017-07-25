package day10.Strings;

import java.util.Arrays;

/**
 * Created by sp0rk on 09/07/17.
 */
public class Operations {
    public static void main(String[] args) {
//        basics();
//        searching();
        mutating();
    }

    private static void basics() {
        String test = "Hello, World!";
        String testLower = "hello, world!";

        System.out.println();
        System.out.println(test.length());
        System.out.println(test.charAt(7));
        System.out.println(test.equals(testLower));
        System.out.println(test.equalsIgnoreCase(testLower));
        System.out.println(test.toLowerCase());
        System.out.println(test.toUpperCase());

    }

    private static void searching() {
        String test = "Hello, World!";

        System.out.println();
        System.out.println(test.indexOf("o"));
        System.out.println(test.lastIndexOf("o"));
        System.out.println(test.indexOf("rld"));
        System.out.println(test.startsWith("He"));
        System.out.println(test.endsWith("World"));
    }

    private static void mutating() {
        String test = " Long text with spaces everywhere\n";

        System.out.println();
        System.out.println(test);
        System.out.println(test.trim());        //Wycina whitespacy z początku i końca tekstu
        System.out.println("----");
        System.out.println(test.replace(" ", ","));
        System.out.println(test.replaceFirst(" ", ","));
        System.out.println(test.replaceAll(" ", ","));      //Ta metoda może działać na RegEx

        System.out.println("----");
        System.out.println(Arrays.toString(test.split(" ")));       //Tnie po spacjach i zwraca tablice stringów (bez spacji) ale przy spacji na początku da nam pierwszy element pusty
        System.out.println(Arrays.toString(test.trim().split(" ")));
        System.out.println("----");
        System.out.println(test.substring(3, 7));
        System.out.println(test.substring(5));
    }
}
