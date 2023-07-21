package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_1_Teil_3;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        Eisbaer knut = new Eisbaer("Knuuut");
        Eisbaer lars = new Eisbaer("Lars"); // Knuts Vater
        Zoo<Eisbaer> zoo = new Zoo<Eisbaer>();
        zoo.fuegeHinzu(knut);
        zoo.fuegeHinzu(lars);

        List<Eisbaer> eisbaerenListe = new ArrayList<> ();
        zoo.schreibeAufListe(eisbaerenListe);
        List<Tier> allgemeineListe = new ArrayList<>();
        zoo.schreibeAufListe(allgemeineListe);
        for (Tier tier : allgemeineListe)
        {
            System.out.println(tier);
        }

    }
}
