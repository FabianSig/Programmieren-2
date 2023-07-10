package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_4;

class Pkw extends Fahrzeug {
    private int anzahlTueren;
    private Fahrzeughalter halter;

    public Pkw(Fahrzeughalter halter, int anzahlRaeder, int anzahlTueren) {
        super(halter, "Pkw", anzahlRaeder);
        this.anzahlTueren = anzahlTueren;

    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }
}
