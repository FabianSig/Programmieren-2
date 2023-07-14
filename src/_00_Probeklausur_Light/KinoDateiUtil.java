package _00_Probeklausur_Light;

import java.util.ArrayList;
import java.util.List;

public class KinoDateiUtil {

    private static String[] Daten = { "Dr. Schiwago---300", "Ghostbusters---104", "Star Wars---180"};
    private static final String leangesteFormat = "Längste Spieldauer : %s (%d Minuten)%n";
    private static final String kuerzesteFormat = "Kürzeste Spieldauer: %s (%d Minuten)%n";
    private static final String durchschnittlicheFormat =  "Durschnittliche Spieldauer: %.2f Minuten";
    private static final String filmFormat = "%20s : %5d Minuten\n";
    public static Kino loadKino(){

        Kino outKino = new Kino();

        for (String f : Daten
        ) {

            String film[] = f.split("---");
            outKino.addFilm (new Film (film[0], Integer.parseInt (film[1])));
        }
        return outKino;
    }

    public static void saveKino(Kino kino){
        for (Film film: kino.getFilmeNachLaenge ()
             ) {

            System.out.printf (filmFormat, film.getName (), film.getLeange ());

        }
        System.out.printf(leangesteFormat, kino.getLaengsterFilm ().getName (), kino.getLaengsterFilm ().getLeange ());
        System.out.printf(kuerzesteFormat, kino.getKuerzesterFilm ().getName (), kino.getKuerzesterFilm ().getLeange ());
        System.out.printf(durchschnittlicheFormat, kino.getDurchschnittsdauer ());
    }


}
