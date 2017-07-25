package day9;

/**
 * Created by sp0rk on 07/07/17.
 */
public class Objects {

    public static class X {
        int a;

        public void f(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        X x = new X();
        x.a = 5;
        x.f();
    }
}
