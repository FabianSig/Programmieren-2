package _0000_Einstufungstest.C;

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
        Path path = Paths.get("texte.txt");
        List<String> output = new ArrayList<> ();

        for ( Person p: personen) {
            output.add(String.format ("%s,%s,%s,%s",p.getAnrede (), p.getVorname (), p.getNachname (), p.getGeburtstag ().format (formatter)));
        }


        try {
            Files.write(path, output);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
