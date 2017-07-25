package pl.sda.dzien006.geometry;

public class Trapeze extends Quadrangle {       //Trapez rownoramienny
    protected double a;
    private double b;
    protected double h;

    public Trapeze(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getArea() {
        return (a + b) / 2 * h;
    }

    @Override
    public double getPerimeter() {
        double c = Math.abs(a - b) / 2;
        return a + b + 2 * Math.sqrt(h * h + c * c);
    }

    @Override
    public String toString() {
        return "Trapez o podstawach a= %f i b = %f";
    }
}
