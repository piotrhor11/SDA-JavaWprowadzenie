package pl.sda.dzien004;            //Do zrobienia: zamienić zmienne na tabelkę!


public class Equation {
    private double a;
    private double b;
    private double c;

    private double delta;
    private double x1;
    private double x2;
    private int numOfSolutions;         //Normalnie powinniśmy użyć enum do zdefiniowania zbioru możliwych wartości

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getNumOfSolutions() {
        return numOfSolutions;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void solve() {
        if (a == 0) {
            solveLinear();
        } else {
            solveQuadratic();
        }
    }

    private void solveLinear() {
        if (b == 0) {
            if (c == 0) {
                numOfSolutions = -1;
            } else {
                numOfSolutions = 0;
            }
        } else {
            numOfSolutions = 1;
            x1 = -c / b;
        }
    }

    private void solveQuadratic() {
        solveDelta();
        solveSolutions();
        switch (numOfSolutions) {
            case 2:
                double sqrtDelta = Math.sqrt(delta);
                x2 = (-b + sqrtDelta) / (2 * a);
                x1 = (-b - sqrtDelta) / (2 * a);
                break;
            case 1:
                x1 = -b / (2 * a);
                break;
            case 0:
            default:
                //do nothing
        }
    }

    private void solveDelta() {
        delta = b * b - 4 * a * c;
    }

    public void solveSolutions() {
        if (delta > 0) {
            numOfSolutions = 2;
        } else if (delta == 0) {
            numOfSolutions = 1;
        } else {
            numOfSolutions = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Dla rownania %.1 * x^2 + %.1 * x + %.1 = 0 istnieje %d rowiazan, x1 = %.1, x2 = %.1.", getA(), getB(), getC(), getNumOfSolutions(), getX1(), getX2());
    }
}
