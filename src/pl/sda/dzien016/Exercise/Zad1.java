package pl.sda.dzien016.Exercise;

public class Zad1 {
    public static void main(String[] args) {
        String longer = betterString("Piotrek", "Kotek", ((s1, s2) -> s1.length() > s2.length()));
        System.out.println("Longer is " + longer);
        System.out.println("---");
        String hasCat = betterString("Ala", "Kotek", ((s1, s2) -> s1.toLowerCase().contains("kot")));
        System.out.println("W kotowymiarowości lepszy jest " + hasCat);
    }

    interface Better {
        boolean isBetter(String s1, String s2);
    }

    public static String betterString(String s1, String s2, Better better) {
        return (better.isBetter(s1, s2)) ? s1 : s2;
    }
}
