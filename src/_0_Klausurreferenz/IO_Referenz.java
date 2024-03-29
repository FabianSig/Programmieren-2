package _0_Klausurreferenz;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IO_Referenz {
    public static void main(String[] args){



        //SCHREIBEN
        Path path = Paths.get("texte.txt");
        List<String> texte = new ArrayList<> ();
        texte.add("Zeile 1");
        texte.add("Zeile 2");
        texte.add("Zeile 3");

        try {
            Files.write(path, texte);
        } catch (IOException e) {
            e.printStackTrace ();
        }
        
        
        
        //LESEN
        List<String> content;

        try {
            content = Files.readAllLines(path);
            content.forEach (System.out::println);
        } catch (IOException e) {
            e.printStackTrace ();
        }



    }

    public static void reinschreiben(int ... person) {
        Path path = Paths.get ("test.txt");

        try {
            if (Files.notExists (path)) {
                Files.createFile (path);
            }

            BufferedWriter writer = Files.newBufferedWriter (path);

            for (int value : person) {
                writer.append (String.format ("%d", value));
            }

            writer.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
