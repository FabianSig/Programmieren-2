package _08_Uebungen_Zugriffsrechte_Exceptions.Aufgabe_1;

abstract class Fahrzeug {
    private String fahrzeugart;
    private int anzahlRaeder;
    private Fahrzeughalter halter;

    protected Fahrzeug(Fahrzeughalter halter, String fahrzeugart, int anzahlRaeder) {
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
        return "Dieses Fahrzeug ist ein " + this.fahrzeugart + " mit " + this.anzahlRaeder + " Rädern. Es gehört " + this.halter    ;
    }
}
