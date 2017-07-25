package pl.sda.dzien005;

public enum Operator {
    ADD('+'), SUB('-'), MUL('*'), DIV('/'), MOD('%'), POW('^'), NONE(' ');

    private char sign;

    Operator(char sign) {
        this.sign = sign;
    }

    public void printSign() {
        System.out.println(sign);
    }

    public static Operator fromChar(char c) {       //metoda fromChar zwracająca Operator
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
