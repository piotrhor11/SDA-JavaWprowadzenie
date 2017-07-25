package pl.sda.dzien005;

import java.util.Random;

public class Array {
    private double[] array;
    private double average;

    public Array(int n) {
        this.array = new double[n];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble() * 100;                // metoda Random.nextDouble() zwraca nam pseudolosowy Double z zakresu 0-1.
        }
    }

    public void print() {
        for (double v : array) {          // Skrocony zapis petli for each
            System.out.print(String.format("%3.3f  ", v));
        }
        System.out.println();
    }

    public void printMinMax() {
        double min = Double.MAX_VALUE;      //Robimy tak, bo niezaicjalizowane typy proste mają na starcie 0.
        double max = -Double.MAX_VALUE;

        for (double v : array) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }
        System.out.println(String.format("Min = %3.2f, max = %3.2f", min, max));
    }

    public void printAverage() {
        int i = 0;
        do {
            average += array[i];
            i++;
        } while (array.length > i);
        average /= array.length;
        System.out.println(String.format("Avg: %3.2f", average));
    }

    public void printQuartils() {
        int i = 0;
        System.out.print(String.format("Elementy mniejsze od sredniej: "));
        while (i < array.length) {
            if (array[i] < average) {
                System.out.print(String.format("%3.3f, ", array[i]));
            }
            i++;
        }
        System.out.println();
        System.out.print(String.format("Elementy wieksze od sredniej: "));
        while (i - 1 >= 0) {                                  //przechodzimy po tablicy z góry w dół. Myslalem, ze to bedzie fajne ale nie jest. :P
            if (array[i - 1] > average) {
                System.out.print(String.format("%3.3f, ", array[i - 1]));
            }
            i--;
        }
    }

    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.print();
        arr.printMinMax();
        arr.printAverage();
        arr.printQuartils();
    }
}
