package be.vdab.jpfhfdst19.tijdzones;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Tijdzone {
    public static void main(String[] args) {
        var brussel = ZoneId.of("Europe/Brussels");
        System.out.println(brussel);
        var losAngeles = ZoneId.of("America/Los_Angeles");
        System.out.println(losAngeles);
        var standaard = ZoneId.systemDefault();
        System.out.println(standaard);

        var datumEnTijdBrussel = ZonedDateTime.now(brussel);
        System.out.println(datumEnTijdBrussel);

        var datumEnTijdLosAngeles = ZonedDateTime.now(losAngeles);
        System.out.println(datumEnTijdLosAngeles);

        var tijdzone = ZoneOffset.ofHours(3);
        System.out.println(tijdzone);
        var datumEnTijdVanDrieUur = ZonedDateTime.now(tijdzone);
        System.out.println(datumEnTijdVanDrieUur);

    }
}
