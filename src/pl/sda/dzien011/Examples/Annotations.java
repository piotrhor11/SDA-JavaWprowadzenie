package pl.sda.dzien011.Examples;

public class Annotations {
    public static class A {
        public void printMyName() {
            System.out.println("A");
        }
    }

    public static class B extends A {
        @Override
        public void printMyName() {
            super.printMyName();
            System.out.println("But also B");
        }
    }

    @Deprecated
    public static class C {
        @Deprecated
        public void oldMethod() {
            System.out.println("I'm old and useless");
        }
    }

    public static void main(String[] args) {
        new A().printMyName();
        System.out.println();
        new B().printMyName();
        System.out.println();
        new C().oldMethod();
    }
}
