package _06_Uebungen_Abstraktion_und_Beziehungen.Aufgabe_1;

class   Fahrzeug {
    private String fahrzeugart;
    private int anzahlRaeder;
    private Fahrzeughalter halter;

    public Fahrzeug(Fahrzeughalter halter, int anzahlRaeder) {
        this.fahrzeugart = "allgemeines Fahrzeug";
        this.anzahlRaeder = anzahlRaeder;
        this.halter = halter;
        halter.setFahrzeug (this);
    }

    public Fahrzeug(Fahrzeughalter halter, String fahrzeugart, int anzahlRaeder) {
        this.fahrzeugart = fahrzeugart;
        this.anzahlRaeder = anzahlRaeder;
        this.halter = halter;
        halter.setFahrzeug (this);

    }

    public String getFahrzeugart() {
        return fahrzeugart;
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    @Override
    public String toString() {
        return "Dieses Fahrzeug ist ein " + this.fahrzeugart + " mit " + this.anzahlRaeder + " Rädern. Es gehört " + this.halter.getHalter ();
    }
}
