package _05_Uebungen_Vererbung;

class Fahrzeug {
    private String fahrzeugart;
    private int anzahlRaeder;

    public Fahrzeug(int anzahlRaeder) {
        this.fahrzeugart = "allgemeines Fahrzeug";
        this.anzahlRaeder = anzahlRaeder;
    }

    public Fahrzeug(String fahrzeugart, int anzahlRaeder) {
        this.fahrzeugart = fahrzeugart;
        this.anzahlRaeder = anzahlRaeder;
    }

    public String getFahrzeugart() {
        return fahrzeugart;
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    @Override
    public String toString() {
        return "Das Fahrzeug ist ein " + this.fahrzeugart + " mit " + this.anzahlRaeder + " Rädern.";
    }
}
