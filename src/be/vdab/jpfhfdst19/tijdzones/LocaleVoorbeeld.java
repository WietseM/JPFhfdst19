package be.vdab.jpfhfdst19.tijdzones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleVoorbeeld {
    public static void main(String[] args) {
        var duitsland = Locale.FRANCE;
        System.out.println(duitsland);
        var huidigeDatum = LocalDateTime.now();
        var formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", duitsland);
        System.out.println(formatter.format(huidigeDatum));

        var belgie = new Locale("nl", "BE");
        System.out.println(belgie);
        formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", belgie);
        System.out.println(formatter);
        System.out.println(formatter.format(huidigeDatum));
    }
}
