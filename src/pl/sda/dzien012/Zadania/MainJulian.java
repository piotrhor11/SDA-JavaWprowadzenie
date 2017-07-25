package day12;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 * Created by sp0rk on 12/07/17.
 */
public class MainJulian {
    public static void main(String[] args) {
//        isFriday13th();
//        printMondays();
        insignificantr();
    }

    private static void isFriday13th() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date as such yyyy-MM-dd: ");
        String date = input.nextLine();
        LocalDate localDate = LocalDate.parse(date);

        if (localDate.getDayOfMonth() == 13
                && localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            System.out.println("You're in bad luck");
        } else {
            System.out.println("You're lucky");
        }
    }

    private static void printMondays() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        LocalDate current = LocalDate.ofYearDay(year, 1).minusDays(1);

        current = current.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        while (current.getYear() <= year) {
            System.out.println(current);
            current = current.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
    }

    private static void insignificantr() {
        // WCZYTYWANIE DANYCH
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date of birth as such (yyy-MM-dd): ");
        String date = in.nextLine();
        System.out.print("Enter time unit [m/d/h]: ");
        String unit = in.nextLine();
        System.out.printf("Enter amount of %s: ", unit);
        int amount = in.nextInt();

        // DŁUGOŚĆ TRWANIA ŻYCIA UŻYTKOWNIKA
        LocalDateTime birth = LocalDateTime.of(LocalDate.parse(date), LocalTime.NOON); // Południe daty urodzenia
        Duration life = Duration.between(birth, LocalDateTime.now()); // Czas narodziny -> teraz

        // DŁUGOŚĆ TRWANIA CZASU PODANEGO PRZEZ UŻYTKOWNIKA
        Duration event; // Zapamiętanie długości trwania wydarzenia zadanego przez użytkownika. Duration, żeby łatwiej potem było wyciągnąć godziny
        switch (unit) {
            case "m":
                LocalDateTime now = LocalDateTime.now();
                event = Duration.between(now, now.plusMonths(amount)); // Czas teraz -> za kilka miesięcy
                break;
            case "d":
                event = Duration.ofDays(amount); // Czas kilku dni
                break;
            case "h":
                event = Duration.ofHours(amount); // Czas kilku godzin
                break;
            default:
                throw new IllegalArgumentException("Must be m/d/h");
        }

        // PRZEROBIENIE DURATION NA LICZBĘ GODZIN
        double lifeHours = life.toHours();
        double durationHours = event.toHours(); //long automatycznie "tłumaczy się" na double przy przypisaniu

        // WYPISANIE
        double percent = durationHours / lifeHours * 100.0;
        System.out.printf("It's only %.6f%% of your life", percent);
    }


}
