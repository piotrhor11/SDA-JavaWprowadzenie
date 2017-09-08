package pl.sda.dzien012.Zadania;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        isFriday13();
//        printMondays();
        insignifcantr();
    }

    //Zadanie 1
    private static void isFriday13() {
        Scanner input = new Scanner(System.in);             //Input z konsoli
        System.out.print("Enter a date [yyyy-MM-dd]: ");
        String date = input.nextLine();
        LocalDate localDate = LocalDate.parse(date);
        if (localDate.getDayOfMonth() == 13 && localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            System.out.println("You have a bad luck!");
        } else {
            System.out.println("You are lucky");
        }
    }

    //Zadanie 2
    private static void printMondays() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        LocalDate current = LocalDate.ofYearDay(year, 1).minusDays(1);
        current = current.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        while (current.getYear() == year) {
            System.out.println(current);
            current = current.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
    }

    //Zadanie 3
    private static void insignifcantr() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your date of birth [yyyy-MM-dd]: ");
        String date = input.nextLine();
        System.out.print("Enter a time unit [m,d,h]: ");
        String unit = input.nextLine();
        System.out.printf("Enter amount of %s: ", unit);
        int amount = input.nextInt();

        long hours = 0;
        switch (unit) {
            case "m":
                LocalDateTime now = LocalDateTime.now();
                hours = Duration.between(now.minusMonths(amount), now).toHours(); // okres czasu pomiędzy ileś miesięcy temu, a teraz
                break;
            case "d":
                hours += amount * 24;
                break;
            case "h":
                hours += amount;
                break;
            default:
                throw new IllegalArgumentException();
        }
        LocalDateTime birth = LocalDateTime.of(LocalDate.parse(date), LocalTime.NOON);
        long life = Duration.between(birth, LocalDateTime.now()).toHours();

        Double percent = (double) hours / (double) life * 100;
        System.out.printf("It's only %.2f%% of your life", percent);     //% w formaterze uzyskamy wpisując %%

    }
}
