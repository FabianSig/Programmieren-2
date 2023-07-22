package _0_Klausurreferenz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IO_Referenz {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("texte.txt");
        List<String> texte = new ArrayList<> ();
        texte.add("Zeile 1");
        texte.add("Zeile 2");
        texte.add("Zeile 3");
        try {
            Files.write(path, texte);
        } catch (IOException e) {
            throw new IOException (e);
        }

        List<String> content;

        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IOException (e);
        }


        for (String string : content)
        {
            System.out.println(string);
        }
    }
}
