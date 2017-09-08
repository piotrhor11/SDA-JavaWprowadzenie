package pl.sda.dzien012.Examples;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/**
 * Created by sp0rk on 12/07/17.
 */
public class DateTime {
    public static void main(String[] args) {
//        dateLocal();
//        timeLocal();
//        dateTimeLocal();
//        zoned();
//        periodDuration();
//        formatting();
        temporalAdjusters();
    }

    private static void dateLocal() {
        LocalDate now = LocalDate.now();
        LocalDate courseStart = LocalDate.of(2017, 7, 6);
        LocalDate courseEnd = LocalDate.parse("2017-07-18");

        LocalDate tomorrow = now.plusDays(1);
        LocalDate lastMonthSameDay = now.minusMonths(1);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int dayOfMonth = now.getDayOfMonth();
        boolean isLeapYear = now.isLeapYear();

        if (now.isAfter(courseStart) && now.isBefore(courseEnd)) {
            System.out.println("Julian works here");
        } else {
            System.out.println("Julian doesn't work here");
        }

        System.out.println("now " + now);
        System.out.println("start " + courseStart);
        System.out.println("end " + courseEnd);
        System.out.println("tomorrow " + tomorrow);
        System.out.println("lastmonth " + lastMonthSameDay);
        System.out.println("today is " + dayOfWeek);
        System.out.println("day of month " + dayOfMonth);
        System.out.println("is it leap year now? " + isLeapYear);
    }

    private static void timeLocal() {
        LocalTime now = LocalTime.now();

        LocalTime classStart = LocalTime.of(17, 30);
        LocalTime classEnd = LocalTime.parse("21:00");

        LocalTime max = LocalTime.MAX;
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime min = LocalTime.MIN;
        LocalTime noon = LocalTime.NOON;

        boolean isNowMorning = now.isBefore(noon.minusHours(2));

        if (now.isAfter(classStart) && now.isBefore(classEnd)) {
            System.out.println("Class is in progress");
        } else {
            System.out.println("Why are you in class?");
        }

        System.out.println("now " + now);
        System.out.println("start " + classStart);
        System.out.println("end " + classEnd);
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("midnight " + midnight);
        System.out.println("noon " + noon);
        System.out.println("Drink cofee? " + isNowMorning);
    }

    private static void dateTimeLocal() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime courseStart = LocalDateTime.of(2017, Month.JULY, 6, 17, 30);
        LocalDateTime courseEnd = LocalDateTime.parse("2017-07-18T21:00:00");

        int hour = now.getHour();
        DayOfWeek dayOfWeek = now.getDayOfWeek();

        LocalDateTime hourFromNow = now.plusHours(1);

        LocalDate yeltsinResignation = now.minusYears(27).toLocalDate();
        LocalDateTime yeltsinResignationNoon = LocalDateTime.of(yeltsinResignation, LocalTime.NOON);

        System.out.println("now " + now);
        System.out.println("start " + courseStart);
        System.out.println("end " + courseEnd);
        System.out.println("hourNow " + hour);
        System.out.println("dayOfWeek " + dayOfWeek);
        System.out.println("hourFromNow " + hourFromNow);
        System.out.println("YeltsinResigns " + yeltsinResignationNoon);

    }

    private static void zoned() {
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId TehranZone = ZoneId.of("Asia/Tehran");
        Instant now = Instant.now();
        ZonedDateTime TehranNow = ZonedDateTime.ofInstant(now, TehranZone);
        ZonedDateTime hereNow = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());


        ZonedDateTime TehranHourAgo = TehranNow.minusHours(1);

        System.out.println("Tehran Now " + TehranNow.toLocalTime());
        System.out.println("Tehran Hour ago " + TehranHourAgo.toLocalTime());
        System.out.println("here Now " + hereNow.toLocalTime());
        System.out.println("isTehranHourAgoAfterHereNow " + TehranHourAgo.isAfter(hereNow));
    }

    private static void periodDuration() {
        LocalDate courseStart = LocalDate.of(2017, 7, 6);
        LocalDateTime courseEnd = LocalDateTime.parse("2017-07-18T21:00:00");

        Period coursePeriod = Period.between(courseStart, courseEnd.toLocalDate());
        Duration courseDuration = Duration.between(
                LocalDateTime.of(courseStart, LocalTime.of(17, 30)),
                courseEnd);

        System.out.println("periodDuration " + coursePeriod);
        System.out.println("duration " + courseDuration);
        System.out.println("days " + coursePeriod.getDays());
        System.out.println("seconds " + courseDuration.getSeconds());

        long days = courseDuration.toDays();
        long hours = courseDuration.minusDays(days).toHours();
        long minutes = courseDuration.minusDays(days).minusHours(hours).toMinutes();
        long seconds = courseDuration
                .minusDays(days)
                .minusHours(hours)
                .minusMinutes(minutes)
                .getSeconds();

        System.out.printf("duration readable: %d days, %d hours, %d minutes, %d seconds",
                days,
                hours,
                minutes,
                seconds);
    }

    private static void formatting() {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println();
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd MMM yyyy 'r.'")));
        System.out.println();
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.getDefault())));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault())));
        System.out.println();
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.US)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.US)));
    }

    private static void temporalAdjusters() {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime nextTuesday = now.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        LocalDateTime firstWednesday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));
        LocalDateTime secondSaturday = now
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

        System.out.println("next Tue " + nextTuesday);
        System.out.println("first Wed " + firstWednesday);
        System.out.println("second Sat " + secondSaturday);
    }
}
