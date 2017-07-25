package pl.sda.dzien009.Examples;

/**
 * Created by sp0rk on 07/07/17.
 */
public class Methods {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int... numbers) {              // Możemy podać od 0 do w ch*j argumentów :)
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(new int[]{-1, -2, -3}));
    }
}
