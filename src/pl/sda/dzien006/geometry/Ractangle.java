package pl.sda.dzien006.geometry;

public class Ractangle extends Parallelogram {

    public Ractangle(double a, double b) {
        super(a, b, b);
    }

    @Override
    public String toString() {
        return "Rectangle{a= " + a + ", h= " + b;
    }
}
