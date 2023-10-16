package be.vdab.jpfhfdst19.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // onderdelenOpvragenLocalDate();
        // vergelijkenVanLocalDates();
        berekeningenOpLocalDate();
        // opmakenLocalDate();
        // String omzetten naar LocalDate()
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        var scanner = new Scanner(System.in);
        System.out.println("datum (dag/maand/jaar):");
        var datumAlsString = scanner.next();
        var datum = LocalDate.parse(datumAlsString, formatter);
        System.out.println(datum);

    }

    private static void onderdelenOpvragenLocalDate() {
        var vandaag = LocalDate.now();
        System.out.println(vandaag);
        var beginEuro = LocalDate.of(2002, 1, 1);
        System.out.println(beginEuro);
        var eindeBelgischeFrank = LocalDate.of(2001, Month.DECEMBER, 30);
        System.out.println(eindeBelgischeFrank);
        System.out.println(eindeBelgischeFrank.getDayOfMonth()); // 30
        System.out.println(eindeBelgischeFrank.getDayOfYear()); // 364
        System.out.println(eindeBelgischeFrank.getDayOfWeek()); // MONDAY
        System.out.println(eindeBelgischeFrank.getMonthValue()); // 12
        System.out.println(eindeBelgischeFrank.getMonth()); // DECEMBER
        System.out.println(eindeBelgischeFrank.lengthOfMonth()); // 31
        System.out.println(eindeBelgischeFrank.getYear()); // 2001
        System.out.println(eindeBelgischeFrank.isLeapYear()); // false
    }

    private static void vergelijkenVanLocalDates() {
        var vandaag = LocalDate.now();
        var heden = LocalDate.now();
        System.out.println(vandaag.equals(heden));
        var beginEuro = LocalDate.of(2002, Month.JANUARY, 1);
        System.out.println(beginEuro.compareTo(heden)); // 0 if same, -1*(jaren > maanden > dagen) verschil if not same
        System.out.println(heden.isAfter(beginEuro)); // true
        var dagenTussen = ChronoUnit.DAYS.between(beginEuro, heden);
        System.out.println(dagenTussen);
        var jarenTussen = ChronoUnit.YEARS.between(beginEuro, heden);
        System.out.println(jarenTussen);
        var period = Period.between(beginEuro, vandaag);
        System.out.println(period); // P21Y9M15D
        System.out.println("De euro is " + period.getYears() + " jaar, " +
                period.getMonths() + " maand en " + period.getDays() + " dagen geleden ingevoerd.");
    }

    private static void berekeningenOpLocalDate(){
        var eindeBelgischeFrank = LocalDate.of(2001,12, 31);
        var beginEuro = eindeBelgischeFrank.plusDays(1);
        System.out.println(beginEuro);
        System.out.println(beginEuro.plusMonths(1));
        System.out.println(beginEuro.minusDays(1));
        var vandaag = LocalDate.now();
        var adjuster = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        var volgendeWoensdag = vandaag.with(adjuster);
        System.out.println(volgendeWoensdag); //geeft datum van volgende woensdag
    }

    private static void opmakenLocalDate(){
        var beginEuro = LocalDate.of(2002, 1, 1);
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(beginEuro.format(formatter)); // 01/01/2002

        formatter = DateTimeFormatter.ofPattern("E d MMM yyyy");
        System.out.println(beginEuro.format(formatter));
    }
}
