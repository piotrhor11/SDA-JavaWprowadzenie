package pl.sda.dzien010.Examples.Exceptions;

/**
 * Created by sp0rk on 09/07/17.
 */
public class Throwing {

    public static void main(String[] args) {
        Integer i = new Integer(42);
//        System.out.println(getString(i));
//        System.out.println(getString2(i));
//
        i = null;
        System.out.println(getString(i));
        System.out.println(getString2(i));
        System.out.println("Koniec Metody");
    }

    public static String getString(Object o) {
        if (o != null) {
            return o.toString();
        } else {
            throw new NullPointerException();
        }
    }

    public static String getString2(Object o) {
        return o.toString();
    }

}
