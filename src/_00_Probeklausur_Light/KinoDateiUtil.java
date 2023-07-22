package _00_Probeklausur_Light;

public class KinoDateiUtil {



    public static void saveKino(Kino kino){

        kino.getFilmeNachLaenge ().forEach (System.out::println);
        System.out.printf ("%nInformation%n");
        System.out.printf ("Längste  Spieldauer : %s (%d Minuten)%n", kino.getLaengsterFilm ().getName (), kino.getLaengsterFilm ().getLeange ());
        System.out.printf ("Kürzeste Spieldauer : %s (%d Minuten)%n", kino.getKurzesterFilm ().getName (), kino.getKurzesterFilm ().getLeange ());
        System.out.printf ("Durchschnittliche Spieldauer: %.2f Minuten", kino.getDurchschnittlicheDauer ());
    }

}
