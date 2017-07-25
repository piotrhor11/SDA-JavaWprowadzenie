package pl.sda.dzien010.Examples.Strings;

/**
 * Created by sp0rk on 09/07/17.
 */
public class Formatting {
    public static void main(String[] args) {
        double d = 5.53745;
        int i = 102394;
        String s = "test";

        String x = "Int " + i + ", Double " + d + ", String " + s;
        System.out.println("1 " + x);

        x = String.format("Int %d, Double %f, String %s", i, d, s);     //String.format to sprawny i szybki sposób wyświetlenia liczb
        System.out.println("2 " + x);

        x = String.format("String %3$s, Double %2$f, Int %1$d", i, d, s);
        System.out.println("3 " + x);

        x = String.format("Int |%20d|, Double |%020f|, String %s", i, d, s);       //Wyświtlenie z zachowaniem wolnej przestrzeni
        System.out.println("4 " + x);

        x = String.format("Int |%+d|, Double |%.2f|, String %s", i, d, s);  //%.2f - zaokrągnla do 2 miejsc po przecinku
        System.out.println("5 " + x);

        System.out.println(String.format("%d%%", i));       //Żeby wpisać % musimy użyć %%
    }
}
