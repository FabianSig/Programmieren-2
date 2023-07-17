package _09_Uebungen_Collections.Aufgabe_1;

import java.util.ArrayList;
import java.util.List;

class NatuerlichePerson extends Person implements Fahrzeughalter {
    private String vorname;
    private String nachname;
    private List<Fahrzeug> fahrzeuge;

    public NatuerlichePerson(String vorname, String nachname) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
        this.fahrzeuge = new ArrayList<> ();

    }


    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

    @Override
    public List<Fahrzeug> getFahrzeug() {
        return fahrzeuge;
    }

    @Override
    public void addFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeuge.add (fahrzeug);
    }
}
