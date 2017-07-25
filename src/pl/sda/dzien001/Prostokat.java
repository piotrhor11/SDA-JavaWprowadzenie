package pl.sda.dzien001;

public class Prostokat {
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        if (a < 0) {
            a = Math.abs(a);
        }
        if (b < 0) {
            b = Math.abs(b);
        }
        this.a = a;
        this.b = b;
    }

    public int obliczPole() {
        return a * b;
    }

    public int obliczObwod() {
        return 2 * (a + b);
    }

    public void powiedzCos() {
        System.out.println("No to liczymy obwód i pole:");
    }
}