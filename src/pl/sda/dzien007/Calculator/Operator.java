package pl.sda.dzien007.Calculator;

public enum Operator {
    ADD('+', new Operation.Add()),
    SUB('-', new Operation.Subtract()),
    MUL('*', new Operation.Multiply()),
    DIV('/', new Operation.Divide()),
    MOD('%', new Operation.Modulo()),
    POW('^', new Operation.Power()),
    NONE(' ', new Operation.None());

    private char sign;
    private Operation operation;

    Operator(char sign, Operation operation) {
        this.sign = sign;
        this.operation = operation;
    }

    public void printSign() {
        System.out.println(sign);
    }

    public double eval(double a, double b) {
        return operation.eval(a, b);
    }

    public static Operator fromChar(char c) {
        switch (c) {
            case '+':
                return ADD;
            case '-':
                return SUB;
            case '*':
                return MUL;
            case '/':
                return DIV;
            case '%':
                return MOD;
            case '^':
                return POW;
            default:
                return NONE;
        }
    }
}
