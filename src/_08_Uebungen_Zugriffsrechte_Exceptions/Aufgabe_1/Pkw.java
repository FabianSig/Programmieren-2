package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_1;

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
