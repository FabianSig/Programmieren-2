package _11_Uebungen_Funktionales_und_IO.Aufgabe_3_b_c;

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
