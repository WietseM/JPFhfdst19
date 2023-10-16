package be.vdab.jpfhfdst19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Geboorte {
    public static void main(String[] args) {
        boolean conditie = true;
        while(conditie){
            try {
                var vandaag = LocalDate.now();
                var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
                var scanner = new Scanner(System.in);
                System.out.println("Geef je geboortedatum (dag/maand/jaar):");
                var geboorteDatumInString = scanner.next();
                var geboorteDatum = LocalDate.parse(geboorteDatumInString, formatter);
                conditie = false;
                System.out.println("You were born on a " + geboorteDatum.getDayOfWeek());
                var aantalJaren = ChronoUnit.YEARS.between(geboorteDatum, vandaag);
                System.out.println("You are " + aantalJaren + " years old.");
            } catch (DateTimeParseException ex) {
                System.out.println("Geen geldige datum, probeer opnieuw.");
            }
        }
    }
}
