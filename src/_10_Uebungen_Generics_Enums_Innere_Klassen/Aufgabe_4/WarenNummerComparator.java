package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_4;

import java.util.Comparator;

public class WarenNummerComparator implements Comparator<Ware> {
    @Override
    public int compare(Ware w1, Ware w2) {
        return w1.getBezeichnung ().compareTo (w2.getBezeichnung ());
    }
}
