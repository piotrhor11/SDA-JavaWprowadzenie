package day9;

import java.util.ArrayList;

/**
 * Created by sp0rk on 07/07/17.
 */
public class Loops {
    public static void main(String[] args) {
        f();
        System.out.println();
        fe();
        System.out.println();
        w();
    }

    public static void f(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void fe(){
        int[] arr = {1,2,3,4,5};
        for (Integer integer : arr) {
            System.out.println(integer);
        }

        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        for (Integer integer : list){
            System.out.println(integer);
        }
    }

    public static void w(){
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
    }
}
