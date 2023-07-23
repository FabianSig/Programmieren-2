package _0000_Einstufungstest.E;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class DateiErsteller {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    public static void erstelleDatei(Person... personen){
        Path pathPersonen = Paths.get("Personen.txt");
        Path pathAdressen = Paths.get("Adressen.txt");
        List<String> outputPersonen = new ArrayList<> ();
        List<String> outputAdressen = new ArrayList<> ();

        for ( Person p: personen) {
            outputPersonen.add(String.format ("%s,%s,%s,%s",p.getAnrede (), p.getVorname (), p.getNachname (), p.getGeburtstag ().format (formatter)));
            for (Adresse a: p.getAdressen ()) {
                if(a instanceof PostalischeAdresse) outputAdressen.add (String.format ("%s,%s,%s,%s", ((PostalischeAdresse) a).getStrasse (), ((PostalischeAdresse) a).getHausnummer (), ((PostalischeAdresse) a).getPlz (), ((PostalischeAdresse) a).getOrt ()));
                else outputAdressen.add (a.toString ());
            }
        }

        try {
            Files.write(pathPersonen, outputPersonen);
            Files.write(pathAdressen, outputAdressen);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
