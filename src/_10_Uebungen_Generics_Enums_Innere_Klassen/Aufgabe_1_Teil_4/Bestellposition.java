package _10_Uebungen_Generics_Enums_Innere_Klassen.Aufgabe_1_Teil_4;

class Bestellposition {
    private Ware ware;
    private int menge;

    public Bestellposition(Ware ware, int menge) {
        this.ware = ware;
        this.menge = menge;
    }

    public Ware getWare() {
        return ware;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return this.ware + String.format ("%15d%n", this.menge);
    }
}
