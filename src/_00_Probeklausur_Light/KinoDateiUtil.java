package _00_Probeklausur_Light;

import java.util.ArrayList;
import java.util.List;

public class KinoDateiUtil {

    private static String[] Daten = { "Dr. Schiwago---300", "Ghostbusters---104", "Star Wars---180"};

    public static Kino loadKino(){

        Kino outKino = new Kino();

        for (String s : Daten
        ) {

            String film = "";
            String leange = "";


            int i = 0;
            while (s.charAt (i) != '-') {
                film += s.charAt (i++);
            }
            i += 3;

            for (int j = i; j < s.length (); j++) {
                leange += s.charAt (j);
            }

            outKino.addFilm (new Film (film, Integer.parseInt (leange)));
        }
        return outKino;
    }

    public static void saveKino(Kino kino){
        for (Film film: kino.getFilmeNachLaenge ()
             ) {

            System.out.format ("%20s", film.getName ());
            System.out.print (" : ");
            System.out.format ("%5d", film.getLeange ());
            System.out.println (" Minuten");
        }
        System.out.format("Längste Spieldauer : %s (%d Minuten)%n", kino.getLaengsterFilm ().getName (), kino.getLaengsterFilm ().getLeange ());
        System.out.format("Kürzeste Spieldauer: %s (%d Minuten)%n", kino.getKuerzesterFilm ().getName (), kino.getKuerzesterFilm ().getLeange ());
        System.out.format ("Durschnittliche Spieldauer: %.2f Minuten", kino.getDurchschnittsdauer ());
    }


}
