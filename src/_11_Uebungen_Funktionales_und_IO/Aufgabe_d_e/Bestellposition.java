package _11_Uebungen_Funktionales_und_IO.Aufgabe_d_e;

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
