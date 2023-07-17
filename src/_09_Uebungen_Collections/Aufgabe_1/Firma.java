package _09_Uebungen_Collections.Aufgabe_1;

import java.util.ArrayList;
import java.util.List;

class Firma extends JuristischePerson implements Fahrzeughalter {
    private List<Fahrzeug> fahrzeuge;

    public Firma(String name) {
        super(name);
        fahrzeuge = new ArrayList<> ();
    }
    @Override
    public List<Fahrzeug> getFahrzeug() {
        return fahrzeuge;
    }

    @Override
    public void addFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeuge.add(fahrzeug);
    }



    @Override
    public String toString() {
        return "Firma " + super.toString ();
    }
}
