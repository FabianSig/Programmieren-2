package _00_Probeklausur_Light;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class KinoFactory {

    public static Kino getKino(String dateiname) throws IOException {

        Kino k = new Kino();
        Path path = Paths.get(System.getProperty ("user.home"), dateiname);

        List<String> content;

        try {
            content = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IOException (e);
        }

        for (String s : content) {
            String film[] = s.split("---");
            k.addFilm (new Film (film[0], Integer.parseInt (film[1])));
        }
        return k;
    }
}
