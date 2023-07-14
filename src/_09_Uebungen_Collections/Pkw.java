package _09_Uebungen_Collections;

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
