package be.vdab.jpfhfdst19.tijdzones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleVoorbeeld {
    public static void main(String[] args) {
        var duitsland = Locale.GERMAN;
        var huidigeDatum = LocalDate.now();
        var formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", duitsland);
        System.out.println(formatter.format(huidigeDatum));

        var belgie = new Locale("nl", "BE");
        formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", belgie);
        System.out.println(formatter.format(huidigeDatum));
    }
}
