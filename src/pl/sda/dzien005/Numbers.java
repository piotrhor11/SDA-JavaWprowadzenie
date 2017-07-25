package pl.sda.dzien005;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private int n;

    public Numbers(int n) {
        this.n = n;
    }

    public void printOdds() {
        List<Integer> list = new ArrayList<>();         //Tworzymy listę intigerów
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public void printEvenAndDivBySeven() {
        List<Integer> list = new ArrayList<>();         //Tworzymy listę intigerów
        for (int i = 1; i <= n; i++) {
            if ((i % 2 == 0) || (i % 7 == 0)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Numbers nums = new Numbers(60);
        nums.printOdds();
        nums.printEvenAndDivBySeven();
    }
}
