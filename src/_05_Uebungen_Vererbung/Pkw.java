package _05_Uebungen_Vererbung;

class Pkw extends Fahrzeug{
    private int anzahlTueren;

    public Pkw(int anzahlRaeder, int anzahlTueren) {
        super("Pkw", anzahlRaeder);
        this.anzahlTueren = anzahlTueren;

    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }
}
