package day10.Strings;

import java.util.Arrays;

/**
 * Created by sp0rk on 09/07/17.
 */
public class Basics {
    public static void main(String[] args) {
//        f();
        g();
    }

    public static void f() {
        String s = "abc";
        char[] chars = s.toCharArray();     //Można się dostać wprost do tablicy charów danego stringa

        char[] chars2 = {'a', 'b', 'c'};
        String s2 = new String(chars2);

        System.out.println(Arrays.equals(chars, chars2));
        System.out.println(s.equals(s2));
        System.out.println();
    }

    public static void g() {
        String a = "test";
        String b = "test";

        String c = new String("test");
        String d = new String("test");

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        System.out.println();
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println();
    }
}
