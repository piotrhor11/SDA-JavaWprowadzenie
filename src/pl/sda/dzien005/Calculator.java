package pl.sda.dzien005;

public class Calculator {

    // char o - operator: +, -, *, /, %, ^
    public double eval(double a, char o, double b) {
        double result;
        switch (o) {
            case '+':       //Mozna zrobic bez break, od razu z return.
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    result = 0.0;
                }
                break;
            case '*':
                result = a * b;
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    result = 0.0;
                }
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            default:
                result = 0.0;
        }

        return result;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("6,2 - 7 = " + cal.eval(6.2, '-', 7));
        System.out.println("6,2 + 7 = " + cal.eval(6.2, '+', 7));
        System.out.println("6,2 / 7 = " + cal.eval(6.2, '/', 7));
        System.out.println("6,2 * 7 = " + cal.eval(6.2, '*', 7));
        System.out.println("6,2 % 7 = " + cal.eval(6.2, '%', 7));
        System.out.println("6,2 ^ 7 = " + cal.eval(6.2, '^', 7));
        System.out.println("6,2 k 7 = " + cal.eval(6.2, 'k', 7));
    }
}
