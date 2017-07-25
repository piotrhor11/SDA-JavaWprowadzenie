package pl.sda.dzien007.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.eval(3, Operator.fromChar('+'), 5);

        System.out.println(Operator.valueOf("ADD"));
        for (Operator x : Operator.values()) {
            System.out.println(x);                  // NIESKONCZONE!!!!
        }


//        Operation o1 = new Operation.Add();
//        System.out.println(o1.eval(3, 4));
//        Operation o2 = new Operation.Subtract();
//        System.out.println(o2.eval(3, 4));
//        Operation o3 = new Operation.Multiply();
//        System.out.println(o3.eval(3, 4));
//        Operation o4 = new Operation.Divide();
//        System.out.println(o4.eval(3, 4));
//        Operation o5 = new Operation.Modulo();
//        System.out.println(o5.eval(3, 4));
//        Operation o6 = new Operation.Power();
//        System.out.println(o6.eval(3, 4));


    }
}
