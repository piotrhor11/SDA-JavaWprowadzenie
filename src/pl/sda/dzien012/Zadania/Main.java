package pl.sda.dzien012.Zadania;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        isFriday13();
//        printMondays();
//        insignifcantr();
    }

    //Zadanie 1
    private static void isFriday13() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date [yyyy-MM-dd]: ");
        String date = input.nextLine();
        LocalDate localDate = LocalDate.parse(date);
        if (localDate.getDayOfMonth() == 13 && localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            System.out.println("You have a bad luck!");
        } else {
            System.out.println("You are lucky");
        }
    }

    //Zadanie 2     :(
    private static void printMondays() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        LocalDate current = LocalDate.ofYearDay(year, 1).minusDays(1);
        do {
            current = current.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            System.out.println(current);
        } while (current.getYear() == year);
    }

    //Zadanie 3
//    private static void insignifcantr() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your date of birth [yyyy-MM-dd]: ");
//        String date = input.nextLine();
//        System.out.print("Enter a time unit [m,d,h]: ");
//        String unit = input.nextLine();
//        System.out.printf("Enter amount of %s: ", unit);
//        int amount = input.nextInt();
//
//        int hours = 0;
//        switch (unit) {
//            case "m":
//                hours = Period.ofMonths(amount).getDays() * 24;
//            case "d":
//
//            case "h":
//                hours = +amount;
//                break;
//            default:
//                throw new IllegalArgumentException();
//        }
//        LocalDate dayOfBirth = LocalDate.parse(date);
//        LocalDateTime dateOfBirth = LocalDateTime.of(date);
//        long life = Duration.between(dateOfBirth, LocalDate.now()).toHours();
//
//        Double percent = Double.valueOf(hours) / Double.valueOf(life) * 100;
//        System.out.printf("It's only %.2f%%", percent);     //% w formaterze uzyskamy wpisując %%
//
//    }

}
