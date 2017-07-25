package pl.sda.dzien010.Examples.Exceptions;

/**
 * Created by sp0rk on 09/07/17.
 */
public class Payment {
    public class TooPoorException extends Exception {
        public TooPoorException() {
            super();
        }

        public TooPoorException(String msg) {
            super(msg);
        }
    }

    public Payment(int c) {
        cost = c;
    }

    private int cost;

    public void attemptPayment(int balance) throws TooPoorException {
        if (balance >= cost) {
            System.out.println("Payment OK");
        } else {
            throw new TooPoorException("You need $" + (cost - balance) + " more");
//            throw new TooPoorException();
        }
    }

    public static void main(String[] args) {
        Payment p = new Payment(50);

        try {
            p.attemptPayment(100);
            p.attemptPayment(20);
        } catch (TooPoorException e) {
            e.printStackTrace();
        }
    }
}
