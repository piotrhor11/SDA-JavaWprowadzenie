package pl.sda.dzien007.Calculator;

public class Calculator {

    // char o - operator: +, -, *, /, %, ^
    public double eval(double a, Operator o, double b) {
        return o.eval(a, b);
    }
}
