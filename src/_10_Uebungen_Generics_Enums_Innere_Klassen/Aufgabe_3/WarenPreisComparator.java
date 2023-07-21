package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_3;

import java.util.Comparator;

public class WarenPreisComparator implements Comparator<Ware> {
    @Override
    public int compare(Ware w1, Ware w2) {

        return (int) (w1.getPreis () - w2.getPreis ());
    }
}
