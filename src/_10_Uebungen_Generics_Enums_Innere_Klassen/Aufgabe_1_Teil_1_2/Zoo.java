package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_1_Teil_1_2;

import java.util.ArrayList;
import java.util.List;

class Zoo<T extends Tier> {

    private List<T> zoo;
    public Zoo() {
        this.zoo = new ArrayList<> ();
    }

    public void fuegeHinzu(T tier){
        this.zoo.add (tier);
    }

    /*
    use a super wildcard when you only put values into
    a structure, and don’t use a wildcard when you both get and put.
     */
}
