package pl.sda.dzien004;

public class Main {

    public static void main(String[] args) {

        Palindrome slowo1 = new Palindrome("Kajak");
        Palindrome slowo2 = new Palindrome("Krowa");
        Palindrome slowo3 = new Palindrome("kajak");
        Palindrome slowo4 = new Palindrome("Kobyla ma maly bok");
        Palindrome slowo5 = new Palindrome("");
        Palindrome slowo6 = new Palindrome("a");

        System.out.println(slowo1 + " : " + slowo1.check());
        System.out.println(slowo2 + " : " + slowo2.check());
        System.out.println(slowo3 + " : " + slowo3.check());
        System.out.println(slowo4 + " : " + slowo4.check());
        System.out.println(slowo5 + " : " + slowo5.check());
        System.out.println(slowo6 + " : " + slowo6.check());

        System.out.println(slowo1 + " : " + slowo1.checkFaster());
        System.out.println(slowo2 + " : " + slowo2.checkFaster());
        System.out.println(slowo3 + " : " + slowo3.checkFaster());
        System.out.println(slowo4 + " : " + slowo4.checkFaster());
        System.out.println(slowo5 + " : " + slowo5.checkFaster());
        System.out.println(slowo6 + " : " + slowo6.checkFaster());

        //Zad Equation
        Equation eq0 = new Equation(2, -2, 1);
        Equation eq1 = new Equation(0, 5, 3);
        Equation eq2 = new Equation(7, 0, 3);
        Equation eq3 = new Equation(4, 5, 0);
        Equation eq4 = new Equation(0, 0, 3);
        Equation eq5 = new Equation(7, 0, 0);
        Equation eq6 = new Equation(0, 5, 0);
        Equation eq7 = new Equation(0, 0, 0);

        eq0.solve();
        eq1.solve();
        eq2.solve();
        eq3.solve();
        eq4.solve();
        eq5.solve();
        eq6.solve();
        eq7.solve();

        System.out.println(eq0.getNumOfSolutions());
        System.out.println(eq0.getX1());
        System.out.println(eq0.getX2());

        System.out.println(eq1.getNumOfSolutions());
        System.out.println(eq1.getX1());
        System.out.println(eq1.getX2());

        System.out.println(eq2.getNumOfSolutions());
        System.out.println(eq3.getNumOfSolutions());
        System.out.println(eq4.getNumOfSolutions());
        System.out.println(eq5.getNumOfSolutions());
        System.out.println(eq6.getNumOfSolutions());
        System.out.println(eq7.getNumOfSolutions());

//        System.out.println(eq2.toString());

    }
}
