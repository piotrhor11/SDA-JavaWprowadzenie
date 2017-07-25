package pl.sda.dzien007.Calculator;

public interface Operation {            // Wpisanie klas wewnątrz Interfejsu nic nie zmienia i tak musimy wpisać "Implements"

    default double eval(double a, double b) {
        return 0;
    }

    class Add implements Operation {             //Automatycznie ma Public Static, bo dziedziczy z Interfejsu
        @Override
        public double eval(double a, double b) {
            return a + b;
        }
    }

    class Subtract implements Operation {             //Automatycznie ma Public Static, bo dziedziczy z Interfejsu
        @Override
        public double eval(double a, double b) {
            return a - b;
        }
    }

    class Multiply implements Operation {             //Automatycznie ma Public Static, bo dziedziczy z Interfejsu
        @Override
        public double eval(double a, double b) {
            return a * b;
        }
    }

    class Power implements Operation {             //Automatycznie ma Public Static, bo dziedziczy z Interfejsu
        @Override
        public double eval(double a, double b) {
            return Math.pow(a, b);
        }
    }

    class Divide implements Operation {             //Automatycznie ma Public Static, bo dziedziczy z Interfejsu
        @Override
        public double eval(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        }
    }

    class Modulo implements Operation {             //Automatycznie ma Public Static, bo dziedziczy z Interfejsu
        public double eval(double a, double b) {
            if (b == 0) {
                return 0;
            }
            return a % b;
        }
    }

    class None implements Operation {

    }
}
