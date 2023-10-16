package be.vdab.jpfhfdst19.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // onderdelenOpvragenEnVergelijkenLocalTime();
        // berekeningen op LocalTime();
        var juistVoorMiddag = LocalTime.of(11, 59);
        var middag = juistVoorMiddag.plusMinutes(1);
        System.out.println(middag);
        // opmaken LocalTime();
        var formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(middag.format(formatter));
        formatter = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(middag.format(formatter));
        // String omzetten naar LocalTime();
        formatter = DateTimeFormatter.ofPattern("H:m");
        var scanner = new Scanner(System.in);
        System.out.println("tijd (uren:minuten):");
        var tijdAlsString = scanner.next();
        var tijd = LocalTime.parse(tijdAlsString, formatter);
        System.out.println(tijd);
    }

    private static void onderdelenOpvragenEnVergelijkenLocalTime() {
        var nu = LocalTime.now();
        System.out.println(nu);
        var middag = LocalTime.of(12, 0);
        System.out.println(middag);
        // Onderdelen opvragen van LocalTime
        System.out.println(nu.getHour());
        System.out.println(nu.getMinute());
        System.out.println(nu.getSecond());
        System.out.println(nu.getNano());
        // Vergelijken van LocalTimes
        var ietsLater = LocalTime.now();
        System.out.println(nu.equals(ietsLater)); // true
        var straks = LocalTime.of(23, 59);
        System.out.println(nu.compareTo(straks)); // -1 if not same, 0 if same
        System.out.println(nu.isBefore(straks));
        var minutenTussen = ChronoUnit.MINUTES.between(nu, straks);
        System.out.println(minutenTussen);
    }

}
