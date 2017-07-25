package pl.sda.dzien005;

public class CalculatorEnum {

    // char o - operator: +, -, *, /, %, ^
    public double eval(double a, Operator o, double b) {
        double result;
        switch (o) {
            case ADD:       //Mozna zrobic bez break, od razu z return.
                result = a + b;
                break;
            case SUB:
                result = a - b;
                break;
            case DIV:
                if (b != 0) {
                    result = a / b;
                } else {
                    result = 0.0;
                }
                break;
            case MUL:
                result = a * b;
                break;
            case MOD:
                if (b != 0) {
                    result = a % b;
                } else {
                    result = 0.0;
                }
                break;
            case POW:
                result = Math.pow(a, b);
                break;
            default:
                result = 0.0;
        }

        return result;
    }

    public static void main(String[] args) {
        CalculatorEnum cal = new CalculatorEnum();
        System.out.println("6,2 - 7 = " + cal.eval(6.2, Operator.fromChar('-'), 7));
        System.out.println("6,2 + 7 = " + cal.eval(6.2, Operator.fromChar('+'), 7));
        System.out.println("6,2 / 7 = " + cal.eval(6.2, Operator.fromChar('/'), 7));
        System.out.println("6,2 * 7 = " + cal.eval(6.2, Operator.fromChar('*'), 7));
        System.out.println("6,2 % 7 = " + cal.eval(6.2, Operator.fromChar('%'), 7));
        System.out.println("6,2 ^ 7 = " + cal.eval(6.2, Operator.fromChar('^'), 7));
//        System.out.println("6,2 k 7 = " + cal.eval(6.2, 'k', 7));

        Operator.ADD.printSign();
    }
}
