package day9;

/**
 * Created by sp0rk on 07/07/17.
 */
class Scopes {
    public static int x = 1;

    public static void f() {
        System.out.println(x);
    }

    public static void g() {
        int x = 2;
        System.out.println(x);
    }

    public static void h() {
        int x;
        for (x = 4; x == 4; x++) {
            System.out.println(x);
        }
        System.out.println(x);
    }

    public static void i() {
        for (int x = 3; x == 3; x++) {
            System.out.println(x);
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("f");
        f();
        System.out.println("\ng");
        g();
        System.out.println("\nh");
        h();
        System.out.println("\ni");
        i();
    }
}
