package pl.sda.dzien010.Examples.Exceptions;

import java.util.Arrays;

/**
 * Created by sp0rk on 09/07/17.
 */
public class Handling {
    public static void main(String[] args) {
        Integer i = new Integer(42);
        System.out.println(checkedGetString(i));
        System.out.println(checkedGetStringPlusOne(i));

        i = null;
        System.out.println(checkedGetString(i));
        System.out.println(checkedGetStringPlusOne(i));

        System.out.println(Arrays.toString(divideOneToTenArray(0, 5, 2)) + "\n");
        System.out.println(Arrays.toString(divideOneToTenArray(0, 20, 2)) + "\n");
        System.out.println(Arrays.toString(divideOneToTenArray(0, 5, 0)) + "\n");
    }

    public static String checkedGetString(Integer i) {
        try {
            return i.toString();
        } catch (NullPointerException e) {
            return "I've received a null object";
        }
    }

    public static String checkedGetStringPlusOne(Integer i) {
        Integer finalNumber = 0;
        try {
            finalNumber = i.intValue();
        } catch (NullPointerException e) {
            finalNumber = 100;
        } finally {
            finalNumber += 1;
        }
        return finalNumber.toString();
    }


    private static int[] divideOneToTenArray(int start, int end, int divisor) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] returnArray = new int[10];

        try {
            for (int i = start; i < end; i++) {
                returnArray[i] = array[i] / divisor;
            }
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero. Returning useless array");
            Arrays.fill(returnArray, -1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Returning anyway");
        }

        return returnArray;
    }
}
